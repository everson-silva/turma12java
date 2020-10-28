programa
{
	
	funcao inicio()
	{
		real a, b, c, d, ee, f, x, y
		escreva("Escreva o coeficientes a: ")
		leia(a)
		escreva("Escreva o coeficientes b: ")
		leia(b)
		escreva("Escreva o coeficientes c: ")
		leia(c)
		escreva("Escreva o coeficientes d: ")
		leia(d)
		escreva("Escreva o coeficientes e: ")
		leia(ee)
		escreva("Escreva o coeficientes f: ")
		leia(f)

		x=((c*ee)-(b*f))/((a*ee)-(b*d))
		y=((a*f)-(c*d))/((a*ee)-(b*d))

		escreva("O valor de x = "+x+" e y = "+y)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 375; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */