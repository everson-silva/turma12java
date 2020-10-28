programa
{
	inclua biblioteca Matematica --> mat 
	funcao inicio()
	{
		real x1, x2, y1, y2,d

		
		escreva("A coordenada x do ponto 1: ")
		leia(x1)
		escreva("\nA coordenada y do ponto 1: ")
		leia(y1)
		escreva("\nA coordenada x do ponto 2: ")
		leia(x2)
		escreva("\nA coordenada y do ponto 2: ")
		leia(y2)

		d = mat.raiz(((mat.potencia((x2-x1), 2.0)) + (mat.potencia((y2-y1), 2.0))), 2.0)

		escreva("\nA distância entre esses dois pontos é de "+d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */