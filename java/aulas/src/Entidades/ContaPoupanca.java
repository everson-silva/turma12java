package Entidades;

public class ContaPoupanca extends Conta{

	private int aniversarioConta;

	//construtor
	public ContaPoupanca(String cpf, int numero, int aniversarioConta) {
		super(cpf, numero);
		this.aniversarioConta = aniversarioConta;
	}
	
}
