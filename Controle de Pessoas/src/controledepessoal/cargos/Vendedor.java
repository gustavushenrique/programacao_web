package controledepessoal.cargos;

public class Vendedor extends FuncionarioBase {

	private float comissao;

	public Vendedor(String nome, float salarioBase, float comissao) {
		super(nome, salarioBase);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

}