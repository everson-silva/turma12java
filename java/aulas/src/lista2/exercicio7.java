package lista2;
import java.util.Scanner;
public class exercicio7 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		
		double base=0.0, altura=0.0, area=0.0;
		
		System.out.print("Digite a base:");
		base = teclado1.nextDouble();
		System.out.print("Digite a altura: ");
		altura = teclado1.nextDouble(); 
		
		System.out.println( (base > 0 && altura > 0 )? "A area do triangulo � "+((base * altura)/2):"Vc n�o digitou valores validos!!!" );

	}

}
