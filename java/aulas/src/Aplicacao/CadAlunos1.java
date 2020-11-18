package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class CadAlunos1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nomeAluno;
		int matriculaAluno;
		
		
		
		
		System.out.println("Bem vindo ao sistema de cadastramento de alunos.\n");
		System.out.println("Entre com o nome do aluno");
		nomeAluno= leia.next();
		System.out.println("Entre com o matricula do aluno");
		matriculaAluno=leia.nextInt();
		
		Aluno aluno1 = new Aluno(matriculaAluno, nomeAluno);
		
		
		System.out.println("Entre com o genero do aluno. M - Masculino, F - Feminino, O - Outro.");
		aluno1.setGenero(leia.next().toUpperCase().charAt(0));

	}

}
