package lista5;

public class exercicio4 {

	public static void main(String[] args) {
		double soma=0.0,imp=1.0;
		for (int x=1;x<=50;x++)
		{
			soma  =  imp/x + soma;
			imp = imp+2;
		}
		System.out.print( "A soma = "+ soma);

	}

}
