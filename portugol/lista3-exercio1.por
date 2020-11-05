programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		
		const inteiro n=20
		real s,sT=0.0, sMed, sMai=0.0, psMen, fMed, f, fT=0.0
		inteiro sMen=0

		escreva("Programa Pesquisa da Prefeitura\n")

		para (inteiro x=1; x<=n; x++){
			escreva("\nQual o valor do seu salario? ")
			leia(s)
			escreva("\nQuantos filhos você tem? ")
			leia(f)
			sT=sT+s
			fT=fT+f
			
			se (s>sMai){
				sMai=s
			}

			se (s<=100){
				sMen++
			}
			limpa()
		}
		sMed=(sT/n)
		psMen= ((sMen*100)/n)
		fMed= (fT/n)

		escreva("Média do salário da população: \nR$ ", mat.arredondar(sMed,2))
		escreva("\n\nMédia do número de filhos: \n",mat.arredondar(fMed,2) )
		escreva("\n\nMaior salário: \nR$ ", sMai)
		escreva("\n\nPercentual de pessoas com salário até R$100,00: \n", mat.arredondar(psMen,2)," %\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */