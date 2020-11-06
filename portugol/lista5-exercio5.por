programa
{
	
	funcao inicio()
	{
		real v[5]
		inteiro cod=0
		
		para (inteiro x = 0; x<5; x++)
		{
			escreva("Digite o valor para o vetor ",x+1," : ")	
			leia(v[x])
		}
		
		escreva("\nDigite um codigo 1 ou 2 ou 0: ")
		leia(cod)

		enquanto (cod<0 ou cod>2)
		{
			escreva("\nERROR!Digite um codigo 1 ou 2 ou 0: ")
			leia(cod)
		}
		
		se (cod==0)
		{
			escreva("Fim do programa!")
		}
		senao se (cod==1)
		{
			escreva("\nVetor= ")
			para (inteiro x=0; x<5; x++)
			{
			escreva("| ",v[x]," ")	
			}
			escreva("|")
		}
		senao
		{
			escreva("\nVetor= ")
			para (inteiro x=4; x>=0; x--)
			{
			escreva("| ",v[x]," ")	
			}
			escreva("|")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 556; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */