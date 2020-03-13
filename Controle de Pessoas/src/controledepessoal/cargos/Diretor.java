package controledepessoal.cargos;

public class Diretor extends FuncionarioBase {

	private float bonus;

	public Diretor(String nome, float salarioBase, float bonus) {
		super(nome, salarioBase);
		this.bonus = bonus;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

}
