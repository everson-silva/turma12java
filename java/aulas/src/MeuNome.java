import java.util.Scanner;

public class MeuNome {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento, anoAtual=2020;
		int idade;
		String nome;
		double salario;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite o salário: ");
		salario = leia.nextDouble();
		
		idade= anoAtual-anoNascimento;
		
		System.out.printf(" Nome: %s .\n Idade = %d \n Salario ", nome, idade);
		
	}
}

