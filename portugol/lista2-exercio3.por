programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, qn1, qn2, qn3, qn4
		escreva("Programa para calcular o quadrado de cada um dos quatro numeros.\n")
		escreva("\nEnte com o primeiro numero: ")
		leia(n1)
		escreva("\nEnte com o segundo numero: ")
		leia(n2)
		escreva("\nEnte com o terceiro numero: ")
		leia(n3)
		escreva("\nEnte com o quarto numero: ")
		leia(n4)

		qn3= mat.potencia(n3,2.0)

		se (qn3>= 1000) {
			escreva("\nO valor ao quarado do terceiro numero é ",qn3)
		}
		senao {
			qn1= mat.potencia(n1,2.0)
			qn2= mat.potencia(n2,2.0)
			qn4= mat.potencia(n4,2.0)
			escreva("\nO valor ao quarado dos quatro numeros é respectivamente: \n ", qn1,"\n ", qn2,"\n ", qn3,"\n ", qn4)
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */