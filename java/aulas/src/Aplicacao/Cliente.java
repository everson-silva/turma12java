package Aplicacao;

import Entidades.Pessoa;

public class Cliente {

	public static void main(String[] args) {
		
		Pessoa cliente= new Pessoa("ED", "MOTA");
		cliente.anoNascimento = 2000;
		cliente.genero = 'O';
		
		
		System.out.println("Nome do cliente: "+ cliente.nome+ " "+ cliente.sobrenome);
		System.out.print("Idade do cliente: ");
		cliente.idade();
		System.out.println("Genero do cliente: " +cliente.seuGenero());

		

		

	}

}
