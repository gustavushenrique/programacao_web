package controledepessoal.cargos;

public class FuncionarioBase {

	private String nome;
	private float salarioBase;

	public FuncionarioBase(String nome, float salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
}
