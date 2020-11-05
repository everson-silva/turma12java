programa
{
	
	funcao inicio()
	{
		real c=0.0, tS=0.0, m=0.0
		inteiro vL=0
		enquanto (c>=0)
		{
			escreva("Entre com um numero positivo. Para parar coloque um numero negativo: ")
			leia(c)
			
			se (c>=0)
			{
			vL++	
			tS=tS+c
			m=tS/vL
			}
			limpa()
		}

		escreva("Total do somatório: ", tS,"\nMédia: ", m,"\nTotal de valores lidos: ", vL) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */