programa
{
	inclua biblioteca Matematica --> mat 
	funcao inicio()
	{
		real d, r, s
		inteiro a, b, c
		escreva("Entre com o valor de um numero inteiro positivo A: ")
		leia(a)
		escreva("\nEntre com o valor de um numero inteiro positivo B: ")
		leia(b)
		escreva("\nEntre com o valor de um numero inteiro positivo C: ")
		leia(c)

		r = mat.potencia((a+b), 2.0)
		s = mat.potencia((b+c), 2.0)
		d = (r+s)/2

		escreva("O valor de D é " +d )
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 442; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */