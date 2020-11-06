package lista1;
import java.util.Scanner;

public class exercicio3 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.print( "Expresse o tempo de duracão do evento em segundos totais: ");
		int Tseg = teclado1.nextInt();
		
		System.out.print( "O tempo total do evento = "+(Tseg/3600)+" hora(s) "+((Tseg%3600)/60)+" minuto(s) "+((Tseg%3600)%60)+" segundo(s).");

	}

}
