package lista7Classes;

public class Empregado extends PessoaLista7 {

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado() {
		super();
	}

	public Empregado(String nome, int codigoSetor, double salarioBase) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}

	public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	} 
	
	public double calcularSalario() 
	{
		
		double calcularSalario= this.salarioBase * (1-(this.imposto/100));
		
		return calcularSalario;
	}
	
}
