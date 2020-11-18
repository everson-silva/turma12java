package lista7Classes;

public class Fornecedor extends PessoaLista7 {
	private double valorCredito;
	private double valorDivida;
	
	
	
	public Fornecedor() {
		super();
	}


	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo() 
	{
		
		double obterSaldo= this.valorCredito - this.valorDivida;
		
		return obterSaldo;
	}
	
	
	
	
	

}
