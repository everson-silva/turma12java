programa
{
	
	funcao inicio()
	{
		inteiro Tdias, anos, meses, dias
		
		
		escreva("Expresse a seguir sua idade completa em dias: ")
		leia(Tdias)
		anos = (Tdias/365)
		meses =  (Tdias%365)/30
		dias = (Tdias%365)%30

		escreva("Sua idade completa é "+anos+" anos "+meses+" meses "+dias+" dias.")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */