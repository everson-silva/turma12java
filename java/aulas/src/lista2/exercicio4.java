package lista2;
import java.util.Scanner;
public class exercicio4 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.print( "Entre com um numero inteiro: ");
		n = teclado1.nextInt();
		if (n<0){
			System.out.print( n+" é negativo!");
		}
		else if ((n%2==0) || (n==0))
		{
			System.out.print( n+" é par!");
		}
		else 
		{
			System.out.print( n+" é impar!");
		}

	}

}
