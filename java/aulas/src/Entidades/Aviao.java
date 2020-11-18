package Entidades;

public class Aviao {
	
	//atributos
	public String modelo;
	public String fabricante;
	public String peso;
	public int quantidadeAssentos;
	public String tipomotor;
	public boolean voando;
	public int velocidade;
	
	
	//construtor
	public Aviao(String modelo) 
	{
		this.modelo=modelo;
	}
	
	//sobrecarga do canstrutor
	public Aviao(String modelo, String fabricante, String peso, int quantidadeAssentos, String tipomotor) {
		
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.quantidadeAssentos = quantidadeAssentos;
		this.tipomotor = tipomotor;
	}
	//sobrecarga - construtor padrao
	public Aviao()
	{
		
	}
	
	//metodos
	public void decolar()
	{
		this.voando = true;
	}
	public void pouso()
	{
		this.voando=false;
	}
	public void aumentarVelocidade() {
		//soma 1km por hora
		this.velocidade = this.velocidade+1;
	}
	//sobrecarga
	public void aumentarVelocidade(int velocidade) {
		
		this.velocidade = velocidade;
	}
	
	public void diminuirVelocidade() {
		//diminui 1km por hora
		this.velocidade = this.velocidade-1;
	}
	
}
