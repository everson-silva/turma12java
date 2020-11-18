package lista7Programas;

import lista7Classes.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {


		Empregado empregado1=new Empregado("ED", 51, 1200, 15);
		
		System.out.println("Nome: "+empregado1.getNome() + "\nCodigo do setor: "+empregado1.getCodigoSetor()+ "\nSalario base: RS"+ empregado1.getSalarioBase()+ " \nImposto sobre salario: "+ empregado1.getImposto()+" %" );
		
		System.out.println("Seu saldo agora é: "+empregado1.calcularSalario());
	}

}
