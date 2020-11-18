package Aplicacao;

import java.util.Scanner;

import Entidades.Aviao;

public class Turma12Air {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		String modeloAviao;
		int valorVelocidade;
		
		System.out.println("Digite o modelo do aviao: ");
		modeloAviao = leia.next();
		Aviao aviao1 = new Aviao(modeloAviao);
		System.out.println("Qual limite de velocidadede decolagem? ");
		valorVelocidade=leia.nextInt();
		aviao1.aumentarVelocidade(valorVelocidade);
		
		/*for (int x=0;x<valorVelocidade;x++) 
		{
			aviao1.aumentarVelocidade();
		}*/
		
		if(aviao1.velocidade<10)
		{
			aviao1.voando=false;
		}
		else
		{
			aviao1.voando=true;
		}
		
		System.out.println("O aviao esta voando: " + aviao1.voando);
		System.out.println("Qual a velocidade atual: " +aviao1.velocidade);
		aviao1.aumentarVelocidade();
		System.out.println("O aviao esta voando: " + aviao1.voando);
		System.out.println("Qual a velocidade atual: " +aviao1.velocidade);
		

	}

}
