programa
{
	
	funcao inicio()
	{
		inteiro n
		escreva("Digite um numero positivo maior que 0: ")
		leia(n)
		limpa()
		enquanto (n<=0)
		{
			escreva("Error! Digite um numero positivo maior que 0: ")
			leia(n)
			limpa()
		}
		escreva(n," ")
		enquanto (n<=100)
		{
			n=n*3
			escreva(n," ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */