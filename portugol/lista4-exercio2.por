programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro l=10
		inteiro lan[l],s=0,m=0, c=0

		para (inteiro x=0;x<l;x++)
		{
			lan[x]=Util.sorteia(1,6)
			escreva("\nValor na posição ", x+1,"º é : ", lan[x])
		     s=s+lan[x]
		     se (lan[x]>m)
		     {
		     	m=lan[x]
		     	c=0
		     }
		     se (m==lan[x])
		     {
		     	c++
		     }
		    
		}
		escreva("\nSoma de todos os lançamentos: ", s)
		escreva("\nA média aritmética dos lançamentos é: ",s/l)
		escreva("\nO maior valor é: ", m," e foi repetido ",c," vezes.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */