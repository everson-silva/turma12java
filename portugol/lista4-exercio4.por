programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro T=3
		inteiro Mq[T][T],sd=0

		para (inteiro x=0; x<T; x++) //linha
		{
			para (inteiro y=0;y<T;y++) //coluna
			{
				Mq[x][y]=Util.sorteia(1,9)

				se (x==y)
				{
				sd=sd+Mq[x][y]
				}
				escreva(Mq[x][y], " ")
				
			}
			escreva("\n")
		}
		escreva("Soma das diagonais é: ", sd)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */