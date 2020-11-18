package lista7Programas;

import lista7Classes.Fornecedor;

public class TesteFornecedor {

	public static void main(String[] args) {


		Fornecedor fornecedor1 = new Fornecedor("ED", 1200, 500);
		
		System.out.println("Nome: "+fornecedor1.getNome() + " \nValor creditado: RS"+ fornecedor1.getValorCredito()+ " \nValor debitado: R$"+ fornecedor1.getValorDivida() );
		
		System.out.println("Seu saldo agora é: "+fornecedor1.obterSaldo());
		
	}

}
