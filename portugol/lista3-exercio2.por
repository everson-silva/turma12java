programa
{
	
	funcao inicio()
	{
		const inteiro n=500
		inteiro soma=0
		
		para(inteiro x=1; x<=n; x++)
		{
			
			se (x%2!==0) 
			{
				se (x%3==0) 
				{
					soma=soma+x
				}
			}
		}
		escreva("A soma de todos os múltiplos de três entre 1 e ",n," é: \n", soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 54; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */