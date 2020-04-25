<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset='utf-8'>
<title>Tela de Login</title>
<link rel="stylesheet" type="text/css" href="CSS/stylesheet.css"
	media="screen" />
</head>

<%
	String erro = null;

//verifica se os dados de entrada do usuário estão corretos
if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("submit") != null) {

	String usuario = request.getParameter("usuario");
	String senha = request.getParameter("senha");

	// usuario = admin@admin  senha: admin

	if ("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(senha)) {
		out.print("Bem vindo, " + usuario);
		return;

	} else {
		erro = "Usuário ou senha inválido. Por favor, tente novamente.";
	}
}
%>

<body>
	<div id="login">
		<div class="panel panel-primary">
			<div class="container">
				<div class="text-center">
					<h3>Login</h3>
				</div>
			</div>

			<form action="" method="POST">

				<!-- input e-mail -->
				<div class="form-group">
					<input type="text" name="usuario" class="form-control"
						placeholder="Usuário" required>
				</div>

				<!-- input senha -->
				<div class="form-group">
					<input type="password" name="senha" class="form-control"
						placeholder="Senha" required>
				</div>

				<!-- button login -->
				<div class="form-group">
					<button type="submit" name="submit" class="btn btn-primary">Entrar</button>
				</div>

				<%
					if (erro != null) {
				%>
				<div class="form-group text-center">
					<spam> <%
 					out.print(erro);
					 %> </spam>
				</div>
				<%
					}
				%>

				<!-- reset senha-->
				<div class="form-group text-center">
					<a href="">Recuperar Senha</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>