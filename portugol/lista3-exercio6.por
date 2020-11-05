programa
{
	
	funcao inicio()
	{
		inteiro n,soma=0, contador=0
		
		escreva("Digite um numero inteiro positivo: ")
		leia(n)
		limpa()
		enquanto (n<0)
		{
			escreva("Error! Digite um numero inteiro positivo: ")
			leia(n)
			limpa()
		}
		faca
		{
			soma=soma+(1*contador)
			contador++
		}enquanto(contador<=n)
		escreva("A soma de todos os números  de 1 até ",n," é: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */