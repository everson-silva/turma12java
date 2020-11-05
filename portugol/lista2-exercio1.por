programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real p, ex=0.0, m=0.0
		
		escreva("Entre com o peso dos tomates: ")
		leia(p)

		se (p<=50) {
			escreva("Peso dos tomates dentro do limite de 50Kg. ",ex," Kg excedidos e R$",m," de multa a pagar.")
		}
		senao {
			ex=p-50
			m=ex*4
			escreva("Peso dos tomates excedeu o limite de 50Kg. ",mat.arredondar(ex,3)," Kg excedidos e R$ ",mat.arredondar(m,2)," de multa a pagar.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */