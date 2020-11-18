package Entidades;

public class Cliente {
	public String nome;
	public char genero;
	public int anoNascimento;
	public String sobrenome;
	public int codigoCliente;
	
	
	public Cliente() //construtor padrão
	{
		
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa(String nome, String sobrenome)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void codigoCliente() {
		
		this.codigoCliente= 100 ;
		
	}
}
