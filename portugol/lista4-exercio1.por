programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro  n[5], m=0
		
		para (inteiro x=0;x<5;x++)
		{
			escreva("Entre com a ",x+1,"º pontuação: ")
			leia(n[x])
			limpa()
			se (n[x]>m)
			{
				m=n[x]
			}
		}
		para (inteiro x=0;x<5;x++)
		{
			escreva("\nA ",x+1,"º pontuação é: ",n[x])
		}
		escreva("\n\nA maior pontuação é: ", m,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */