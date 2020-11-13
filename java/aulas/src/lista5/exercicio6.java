package lista5;

public class exercicio6 {

	public static void main(String[] args) {
		int vetor[] = new int[3];
		int matriz[][] = new int[3][3];
		int x,y;
		System.out.print( "\nVETOR\n");
		for (x=0;x<3;x++)
		{
			vetor[x] = ((int) ((Math.random() * (3)) + 1));
			System.out.print( "| "+vetor[x]+" ");
		}
		System.out.print( "|");
		System.out.print( "\nMATRIZ\n");
		for (x=0;x<3;x++)
		{
			for (y=0;y<3;y++)
			{
				matriz[x][y] = ((int) ((Math.random() * (3)) + 1));
				System.out.print( "| "+matriz[x][y]+ " ");
			}
			System.out.print( "|\n");
		}
		System.out.print( "\nRESULTADO DA MULTIPLICACAO\n");
		for (x=0;x<3;x++)
		{
			for (y=0;y<3;y++)
			{
				System.out.print( "| "+vetor[y]*matriz[x][y]+ " ");
			}
			System.out.print( "|\n");
		}
	}
}