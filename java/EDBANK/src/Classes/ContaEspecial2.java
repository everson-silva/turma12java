package Classes;

import java.util.Scanner;

public class ContaEspecial2 extends ContaCorrente {

	Scanner leia = new Scanner(System.in);

	//atributo
	private double limite;
	
	//construtor
	public ContaEspecial2(int numero, double limite) {
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
	public void usarLmite(char pergunta, double valorDebitar) {
		
		if (pergunta=='T')
        {
			super.creditar(this.limite);
			this.limite = 0;
        }
        else if (pergunta=='M')
        {
            System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+this.limite+" Valor necessario para o debito = R$"+(valorDebitar-super.getSaldo()));
            double valorRetirar=leia.nextDouble();
            while (valorRetirar>this.limite || valorRetirar<(valorDebitar-super.getSaldo()))
            {
                System.err.println("ERROR!!! Valor solicitado acima do limite ou não cobre o valor necessario para o debito.");
                System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+this.limite+" Valor necessario para o debito = R$"+(valorDebitar-super.getSaldo()));
                valorRetirar=leia.nextDouble();                                
            }
            super.creditar(valorRetirar);
			this.limite -= valorRetirar;
        }
        else //if (pergunta=='A')
        {
        	double aux= ((valorDebitar)-(super.getSaldo()));
        	super.creditar(aux);
        	
        	System.out.println(aux);
			this.limite -=aux;
        }
		
		super.debitar(valorDebitar);
	}
	

}
