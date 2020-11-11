package lista3;

public class exercicio2 {

	public static void main(String[] args) {
		
		final int n=500 ;
		int soma=0;
		for (int x=1;x<=n;x++)
		{
			if (x%2!=0)
			{
				if (x%3==0)
				{
					soma = soma+x;
				}
			}
		}
		System.out.print( "A soma de todos os multiplos de três entre 1 e "+n+" = \n"+ soma+ "\n");
	
	}

}
