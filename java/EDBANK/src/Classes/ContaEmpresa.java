package Classes;

public class ContaEmpresa extends Conta{

	private double emprestimo;
	
	//construtor
	public ContaEmpresa(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
	}

	//encapsulamento
	public double getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	//metodos
	public void pedirEmprestimo(double valorEmprestimo) 
	{
		if(valorEmprestimo<=this.emprestimo)
		{
			super.creditar(valorEmprestimo);
			this.emprestimo -= valorEmprestimo; //this.limite = this.limite - valor
		}
	}
}
