package lista2;
import java.util.Scanner;

public class exercicio1 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		double p,ex=0.0,m=0.0;
		System.out.print( "Entre com o peso dos tomates: ");
		p = teclado1.nextDouble();
		if (p<=50){
			System.out.print( "Peso dos tomates dentro do limite de 50Kg. "+ex+" Kg excedidos e R$"+m+" de multa a pagar.");
		}
		else 
		{
			ex = p-50;
			m = ex*4;
			System.out.print( "Peso dos tomates excedeu o limite de 50Kg. "+ ex+" Kg excedidos e R$ "+m+" de multa a pagar.");
		}

	}

}
