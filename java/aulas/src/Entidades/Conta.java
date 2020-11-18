package Entidades;

public class Conta {
	
	//atributo
	private String cpf;
	private double saldo;
	private int numero;
	
	//construtor
	public Conta(String cpf, int numero)
	{
		
	}

	//encapsulamento total - getter e setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//metodos
	public void debite(double valorDebito) 
	{
		this.saldo=this.saldo-valorDebito;
	}
	public void credite(double valorCredito) 
	{
		this.saldo=this.saldo+valorCredito;
	}

}
