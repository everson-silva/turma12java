package lista1;
import java.util.Scanner;

public class exercicio8 {
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		double cf,ci,cd,cFinal;
		System.out.print( "Escreva o custo de fabrica de um carro: ");
		cf = teclado1.nextDouble();
		cd= ( cf*0.28);
		ci= ( cf*0.45);
		cFinal= ( cf+cd+ci);
		System.out.print( "O custo ao consumidor = " +cFinal);

	}

}
