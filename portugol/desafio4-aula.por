programa
{
	inclua biblioteca Texto --> tx
	
	funcao inicio()
	{
		cadeia t1="CORINTHIANS", t2="PALMEIRAS", t3="SANTOS", t4="SPFC", time
		caracter p
		caracter cont, ver
		inteiro r=1,p1,p2,p3,p4, pt1=0, pt2=0,pt3=0,pt4=0
		
		escreva("Paulistinha!!!\n")
		
		faca {
			escreva("\nRoda ",r,"\n")
			r++
//==============================================================================================			
			escreva(t1)
			escreva("\nG-Ganhou, P-Perdeu ou E-Empatou? ")
			leia(p)
			se ((p == 'G') ou (p== 'g'))
			{
				p1=3				
			}
			senao se ((p =='E') ou (p == 'e'))
			{
				p1=1
			}
			senao 
			{
				p1=0
			}
			pt1=pt1+p1
	//==============================================================================================
			
			escreva(t2)
			escreva("\nG-Ganhou, P-Perdeu ou E-Empatou? ")
			leia(p)
			se ((p == 'G') ou (p== 'g'))
			{
				p2=3				
			}
			senao se ((p =='E') ou (p == 'e'))
			{
				p2=1
			}
			senao 
			{
				p2=0
			}
			pt2=pt2+p2
			
//==============================================================================================
			
			escreva(t3)
			escreva("\nG-Ganhou, P-Perdeu ou E-Empatou? ")
			leia(p)
			se  ((p == 'G') ou (p== 'g'))
			{
				p3=3				
			}
			senao se ((p =='E') ou (p == 'e'))
			{
				p3=1
			}
			senao 
			{
				p3=0
			}
			pt3=pt3+p3

	//==============================================================================================		
			
			escreva(t4)
			escreva("\nG-Ganhou, P-Perdeu ou E-Empatou? ")
			leia(p)
			se  ((p == 'G') ou (p== 'g'))
			{
				p4=3				
			}
			senao se ((p =='E') ou (p == 'e'))
			{
				p4=1
			}
			senao 
			{
				p4=0
			}
			pt4=pt4+p4

	//==============================================================================================		
			limpa()
			escreva ("\nVocê deseja continuar? ")
			leia(cont)
			
			limpa()

			
			
		} enquanto ((cont=='s') ou (cont=='S'))

		escreva("\nTIME 1 ",t1," PONTOS: " ,pt1)
		escreva("\nTIME 2 ",t2," PONTOS: " ,pt2)
		escreva("\nTIME 3 ",t3," PONTOS: " ,pt3)
		escreva("\nTIME 1 ",t4," PONTOS: " ,pt4)
		
		faca
		{
		escreva("\nQual time você deseja ver a pontuação? ")
		leia(time)

		limpa()

		se (time==t1)
		{
			escreva("\nTIME 1 ",t1," PONTOS: " ,pt1)
		}
		senao se (time==t2)
		{
			escreva("\nTIME 2 ",t2," PONTOS: " ,pt2)
		}
		senao se (time==t3)
		{
			escreva("\nTIME 3 ",t3," PONTOS: " ,pt3)
		}
		senao se (time==t4)
		{
			escreva("\nTIME 4 ",t4," PONTOS: " ,pt4)
		}

		senao {
			escreva("\nTime não existente ou nome incorreto")
		}

		escreva ("\nVocê deseja ver a popuação de outro time? ")
          leia(ver)
		limpa()
		}enquanto ((ver=='s') ou (ver=='S'))

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */