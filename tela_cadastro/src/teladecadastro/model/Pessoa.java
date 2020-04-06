package teladecadastro.model;

public class Pessoa {

	private String nome;
	private String rua;
	private String numero;

	public Pessoa(String nome, String rua, String numero) {
		this.nome = nome;
		this.rua = rua;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String toString() {
		return 
				"\nNome: " + nome 
				+ " \nRua: " + rua 
				+ " \nNúmero: " + numero;
	}

}
