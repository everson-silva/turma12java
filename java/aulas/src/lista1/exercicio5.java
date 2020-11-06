package lista1;
import java.util.Scanner;
public class exercicio5 {
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		double n1,n2,n3,md;
		System.out.print( "Entre com a primeira nota do aluno: ");
		n1 = teclado1.nextDouble();
		System.out.print( "Entre com a segunda nota do aluno: ");
		n2 = teclado1.nextDouble();
		System.out.print( "Entre com a terceira nota do aluno: ");
		n3 = teclado1.nextDouble();
		md = ( ( n1*2)+ ( n2*3)+ ( n3*5))/10;
		System.out.print( "A media desse aluno = " +md);

	}

}
