programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro cont=233

		 escreva("CONTAGEM:... ",cont)
		 Util.aguarde(1500)
		 limpa()
		 
		faca {
			se ((cont>=300) e (cont<=400))
			{
				cont=cont+5
			}
			senao 
			{
				cont=cont+3
			}
			
			escreva("CONTAGEM:... ",cont)
			Util.aguarde(1500)
			limpa()
			
		}enquanto (cont<456)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */