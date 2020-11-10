package lista2;
import java.util.Scanner;
import java.lang.Math;
public class exercicio3 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		double n1,n2,n3,n4,qn1,qn2,qn3,qn4;
		System.out.print( "Programa para calcular o quadrado de cada um dos quatro numeros.\n");
		System.out.print( "\nEnte com o primeiro numero: ");
		n1 = teclado1.nextDouble();
		System.out.print( "\nEnte com o segundo numero: ");
		n2 = teclado1.nextDouble();
		System.out.print( "\nEnte com o terceiro numero: ");
		n3 = teclado1.nextDouble();
		System.out.print( "\nEnte com o quarto numero: ");
		n4 = teclado1.nextDouble();
		qn3 = Math.pow( n3,2.0);
		if (qn3>=1000){
			System.out.print( "\nO valor ao quarado do terceiro numero é "+qn3);
		}
		else {
			qn1 = Math.pow( n1,2.0);
			qn2 = Math.pow( n2,2.0);
			qn4 = Math.pow( n4,2.0);
			System.out.print( "\nO valor ao quarado dos quatro numeros são respectivamente: \n "+ qn1+"\n "+ qn2+"\n "+ qn3+"\n "+ qn4);
		}

	}

}
