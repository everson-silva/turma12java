package lista1;

import java.util.Scanner;

public class exercicio1 {
	
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade,meses,dias,Tdias;
		System.out.print( "Expresse a seguir sua idade completa (  anos, meses e dias de idade que voce tem: ");
		System.out.print( "\n anos: ");
		idade = teclado1.nextInt();
		System.out.print( "\n meses: ");
		meses = teclado1.nextInt();
		System.out.print( "\n dias: ");
		dias = teclado1.nextInt();
		Tdias= ( idade*365)+ ( meses*30)+dias;
		System.out.print( "\n A sua idade apenas em dias são de: " + Tdias + " dias");
		

	}

}
