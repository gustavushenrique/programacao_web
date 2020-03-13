package controledepessoal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import controledepessoal.cargos.Diretor;
import controledepessoal.cargos.FuncionarioBase;
import controledepessoal.cargos.Vendedor;

public class ControleDePessoal {

	public static void main(String[] args) throws IOException {

		Vendedor vendedor1 = new Vendedor("Jao", 1200f, 200f);
		Vendedor vendedor2 = new Vendedor("Maria", 1500f, 300f);

		Diretor diretor1 = new Diretor("Mario", 10000f, 5000f);
		Diretor diretor2 = new Diretor("Luigi", 11000f, 4000f);

		ArrayList<FuncionarioBase> funcionarios = new ArrayList<>();

		funcionarios.add(vendedor1);
		funcionarios.add(vendedor2);
		funcionarios.add(diretor1);
		funcionarios.add(diretor2);

		FileWriter arquivo = new FileWriter(new File("funcionarios.txt"));

		for (FuncionarioBase funcionario : funcionarios) {
			arquivo.write(funcionario.getNome() + "\n");

		}

		arquivo.close();

	}

}
