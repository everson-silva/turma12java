package Classes;

public class ContaPoupanca extends Conta 
{
	private int dataAnversario;

	public ContaPoupanca(int numero, int dataAnversario) 
	{
		super(numero);
		this.dataAnversario = dataAnversario;
	}

	public ContaPoupanca(int numero, String cpf_cnpj, int dataAnversario) {
		super(numero, cpf_cnpj);
		this.dataAnversario = dataAnversario;
	}
	
	
}
