programa
{
	
	funcao inicio()
	{
		inteiro idade, meses, dias, Tdias
		
		escreva("Expresse a seguir sua idade completa (anos, meses e dias de idade que você tem:  ")
		escreva("\n anos: ")
		leia(idade)
		escreva("\n meses: ")
		leia(meses)
		escreva("\n dias: ")
		leia(dias)

		Tdias= (idade*365)+(meses*30)+dias

		escreva("\n A sua idade apenas em dias é de: " + Tdias + " dias")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */