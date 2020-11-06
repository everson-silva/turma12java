package lista1;
import java.util.Scanner;
public class exercicio2 {
	
	static Scanner teclado1 = new Scanner(System.in);


	public static void main(String[] args) {
		
		System.out.print( "Expresse a seguir sua idade completa em dias: ");
		int Tdias = teclado1.nextInt();
		System.out.print( "Sua idade completa : "+(Tdias/365)+" ano(s) "+((Tdias%365)/30)+" mese(s) "+((Tdias%365)%30)+" dia(s).");

	}

}
