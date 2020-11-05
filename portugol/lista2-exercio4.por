programa
{
	
	funcao inicio()
	{
		inteiro n
				
		escreva("Entre com um numero inteiro: ")
		leia(n)

		se (n<0) {
			escreva(n," é negativo!")
		}
		senao se ((n%2==0) ou (n==0)) 
		{
			escreva(n," é par!")
		}
			senao 
			{
				escreva(n," é impar!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */