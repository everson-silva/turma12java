programa
{
	
	funcao inicio()
	{
		cadeia n
		caracter s, cont
		logico chefe
		real sal
		inteiro cF

		faca 		
		{
		limpa()
		
		escreva("Escreva seu nome: ")
		leia(n)
		escreva("VocÊ é, escreva M para masculino e F para feminino: ")
		leia(s)
		escreva("É chefe de familia? Digite 1 para sim e 2 para não: ")
		leia(cF)

		chefe = (cF<2)

		

		se ((s=='M') ou (s=='m')) 
		{
			sal=600.00
		}
		senao se (((s=='F') ou (s=='f')) e (chefe == verdadeiro)) 
		{
			sal=1200.00
		}
		senao 
		{
			sal=600.00
		}
		escreva("Nome: ",n,". É chefe de familia: ",chefe,". Valor a receber: R$ ",sal)
		escreva("\nDeseja continuar? ")
		leia(cont)
		} enquanto ((cont=='s') ou (cont=='S'))
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