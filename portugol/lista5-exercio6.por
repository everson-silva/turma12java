programa
{
	inclua biblioteca Util 
	funcao inicio()
	{
			inteiro vetor[3]
			inteiro matriz[3][3] 
			inteiro x, y
			
			escreva("\nVETOR\n")
			para (x=0; x<3; x++)
			{
				vetor[x] = Util.sorteia(1,3)
				escreva("| ",vetor[x]," ")	
			}
			escreva("|")
			
			escreva("\nMATRIZ\n")
			para (x=0; x<3; x++)
			{
				para (y= 0; y<3; y++)
				{
					matriz[x][y]=Util.sorteia(1,3)
					escreva("| ",matriz[x][y], " ")
				}
				
				escreva("|\n")
			}

			escreva("\nRESULTADO DA MULTIPLICACAO\n")
			para (x= 0; x<3; x++)
			{
				para (y= 0; y<3; y++)
				{
					escreva("| ",vetor[y]*matriz[x][y], " ")				
				}
				escreva("|\n")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 645; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */