programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		 real soma = 0.0, imp=1.0
		
		 para (inteiro x=1 ; x<=50; x++)
		 {
		 	soma = imp/x + soma
		 	
		 	imp=imp+2
		 }
		 escreva("A soma é = ", mat.arredondar(soma,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 129; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */