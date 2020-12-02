package Classes;

public class ContaPoupanca extends Conta 
{
	//atributo
	private int dataAniversario;
	
	
	//construtor
	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		this.dataAniversario = dataAniversario;
	}
	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}
	
	//encapsulamento
	public int getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	//metodo
	public void correcao(int data) 
	{
		if (super.getSaldo()>0 && data==this.dataAniversario)
		{
			super.creditar((super.getSaldo()*0.005));
		}
	}
	
	
}
