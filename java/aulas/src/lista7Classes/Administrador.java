package lista7Classes;

public class Administrador extends PessoaLista7{
	
	private double ajudaDeCusto;

	public Administrador() {
		super();
	}

	public Administrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	

}
