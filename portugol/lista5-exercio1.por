programa
{
	
	funcao inicio()
	{
		real valor, vTotal
		inteiro pag
		
		escreva("Entre com o valor do produto: ")
		leia(valor)
		escreva("Qual será a forma de pagamento? \n1 - À vista em dinheiro ou cheque: \n2 - À vista no cartão de crédito: \n3 - Em duas vezes: \n4 - Em três vezes: \n")
		leia(pag)

		enquanto (pag<1 ou pag>4)
		{
			escreva("ERROR!Entre com um numero inteiro de 1 a 4!\n")
			leia(pag)
		}

		se (pag==1)
		{
			vTotal=valor*0.8
		}
		senao se (pag==2)
		{
			vTotal=valor*0.85
		}
		senao se (pag==3)
		{
			vTotal=valor
		}
		senao
		{
			vTotal=valor*1.1
		}
		
		escreva ("\nValor total da compra: R$ ",vTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */