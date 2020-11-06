programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro num, cont1=0, cont2=0, cont3=0, cont4=0
		faca
		{
			num = Util.sorteia(-1,100)
			se (num>=0 e num<=25)
			{
				cont1++
			}
			senao se (num>25 e num<=50)
			{
				cont2++
			}
			senao se (num>50 e num<=75)
			{
				cont3++
			}
			senao se (num>75 e num<=100)
			{
				cont4++
			}
		} enquanto (num>=0)
		
		escreva("Estão nos seguintes intervalos: \n[0-25]: ", cont1," numeros. \n[26-50]: ",cont2," numeros. \n[51-75]: ",cont3," numeros. \n[76-100]: ",cont4," numeros.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */