programa
{
	
	
	funcao inicio()
	{
		inteiro c, n
		const real s=10.00,salE=20.00
		const inteiro h=50
		real sT=0.0,hEx, sEx=0.0
		
		escreva("Entre com o codigo do operario: ")
		leia(c)
		escreva("Entre com o número de horas trabalhadas do operário: ")
		leia(n)

		se (n<h) {
			
			sT= n*s
			
			escreva(" O salário total do operador ",c," é R$ ",sT, " e o salário excedente é R$ ", sEx)
		}
		senao {
			hEx=n-h
			sEx=hEx*salE
			sT=h*s
			escreva(" O salário total do operador ",c," é R$ ",sT, " e o salário excedente é R$ ", sEx)
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */