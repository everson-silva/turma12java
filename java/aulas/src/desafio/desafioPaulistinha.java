package desafio;

import java.util.Scanner;

public class desafioPaulistinha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String times[]= {"CORINTHIANS","PALMEIRAS","SANTOS", "SPFC"};
		int pontos[][]= new int[4][4];
		String resposta;
		
		
		System.out.println("Times:");
		
		for (int x = 0; x<4; x++) {
			
			System.out.println(times[x]);	
		}
		for (int x = 0; x<4; x++) 
		{
			
			System.out.println(times[x]);
			
			for (int xx = 0; xx<4; xx++) 
			{
				for(int xy=0; xy<4; xy++) 
				{
					System.out.println(": Ganhou / Empatou / Perdeu: ");
					resposta = leia.next();
					
					if (resposta== "Ganhou") 
					{
						
					}
					
				}
			}
		}
		
		
		

	}

}
