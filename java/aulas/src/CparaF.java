import java.util.Scanner;

public class CparaF {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	double c,f ;
	
	System.out.println("Digite  a temperatura em C�: ");
	c = leia.nextDouble();
	
	f=(c*1.8)+32;
	
	System.out.println("A temperatura em F�: " +f);
	
	}
}
