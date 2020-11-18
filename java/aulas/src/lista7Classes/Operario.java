package lista7Classes;

public class Operario extends PessoaLista7 {
	
	private double valorProducao;
	private double comissao;
	
	public Operario() {
		super();
	}

	public Operario(String nome, double valorProducao, double comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
