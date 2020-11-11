package lista3;

public class exercicio5 {

	public static void main(String[] args) {
		int cont=233;
		System.out.print( "CONTAGEM:... "+cont);
		
		
		do {
			if ((cont>=300) && (cont<=400))
			{
				cont = cont+5;
			}
			else 
			{
				cont = cont+3;
			}
			System.out.print( "\nCONTAGEM:... "+cont);
			
			
		} while (cont<456);

	}

}
