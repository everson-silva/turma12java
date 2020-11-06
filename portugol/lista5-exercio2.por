programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real kg, al, imc
		
		escreva("Entrada com o peso em quilogramas (ex 98.1): ")
		leia(kg)
		escreva("Entrada com a altura em metros (ex 1.90): ")
		leia(al)
		
		imc = kg/(al*al) 

		escreva("\nIMC = ",mat.arredondar(imc,2) )

		se (imc>=18.5 e imc<=24.9) 
		{
			escreva("\nNo peso ideal")
		}

		senao se (imc> 24.9 e imc<= 29.9) 
		{
			escreva("\nAcima do peso ideal. Procure ajuda medica e um nutricionista!")
		}
		senao se (imc<18.5) 
		{
			escreva("\nAbaixo do peso ideal. Procure ajuda medica e um nutricionista!")
		}
		senao
		{
			escreva("\nObesidade. Procure ajuda medica e um nutricionista!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 295; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */