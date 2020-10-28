programa
{
	
	funcao inicio()
	{
		inteiro Tseg, hora, min, seg
		
		
		escreva("Expresse o tempo de duração do evento em segundos totais: ")
		leia(Tseg)
		hora = (Tseg/3600)
		min =  (Tseg%3600)/60
		seg = (Tseg%3600)%60

		escreva("O tempo total do evento é de "+hora+" horas "+min+" minutos "+seg+" segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 223; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */