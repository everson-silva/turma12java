package Classes;

import java.util.Scanner;

public class ContaEspecial extends ContaCorrente {
	
	Scanner leia = new Scanner(System.in);

	//atributo
	private double limite;
	
	//construtor
	public ContaEspecial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}

	//encapsulamento
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//metodo
	public void usarLmite(double valor) {
		
		if(super.getSaldo()<=0 && this.limite<= valor)
		{
			super.creditar(valor);
			this.limite -= valor; //this.limite = this.limite - valor
			/*System.out.println("Teste");
			int teste=leia.nextInt();
			System.out.println(teste);
			*/
		}
		
	}
	

}
