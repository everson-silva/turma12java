package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;
public class exercicio1 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		final int n=20 ;
		double s,sT=0.0,sMed,sMai=0.0,psMen,fMed,f,fT=0.0;
		int sMen=0;
		
		System.out.print( "Programa Pesquisa da Prefeitura\n");
		for (int x=1;x<=n;x++){
			System.out.print( "\nQual o valor do seu salario? ");
			s = teclado1.nextDouble();
			System.out.print( "\nQuantos filhos voce tem? ");
			f = teclado1.nextDouble();
			sT = sT+s;
			fT = fT+f;
			
			if (s>sMai){
				sMai = s;
			}
			if (s<=100){
				sMen++;
			}
		}
		sMed= ( sT/n);
		psMen= ( ( sMen*100)/n);
		fMed= ( fT/n);
		System.out.print( "Media do salario da população: \nR$ "+ (df.format( sMed)));
		System.out.print( "\n\nMedia do numero de filhos: \n"+df.format( fMed) );
		System.out.print( "\n\nMaior salario: \nR$ "+ sMai);
		System.out.print( "\n\nPercentual de pessoas com salario até R$100,00: \n"+ df.format( psMen)+" %\n");

	}

}
