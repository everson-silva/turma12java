programa
{
	
	funcao inicio()
	{
		
		cadeia nome[29]= {"Ana Cruz", "Bruno Vicente", "Bruno Santos", "Daniel Ferreira", "Dayane Oliveira", "Denis Silva", "Diego Silva", "Erick Alan", "Everson Silva", "Gabriel Silva", "Guilherme Alex", "Guilherme Pereira", "Gustavo Santana", "Isac Oliveira", "Iuri Nunes", "Jenifer Placido", "Jéssica Cristiane", "Joao Sena", "Larissa Ribeiro", "Leonardo Magalhães", "Lucas Gonçalves", "Mariana Oliveira", "Patricia Machado", "Paula Leticia", "Raul Fernandes", "RICARDO FINKELSTEIN", "Thiago Anjos", "Vitória Freitas", "William Xavier"}
		cadeia email[29]= {"anaveronica3001@hotmail.com", "bruno.estivalli@gmail.com", "brunohmoraes93@gmail.com", "daniel.z.ferreira@hotmail.com", "dayane873@gmail.com", "denisvini@gmail.com", "joaquim.diego8@gmail.com", "erickalan068@gmail.com", "eversonmessias@outlook.com", "gabrieldgrafico@outlook.com", "guilhermealex01@gmail.com", "gui.fdsk@hotmail.com", "gumiqueias@hotmail.com", "zaq.c@live.com", "iurinunes01@gmail.com", "jenifer.sdti@gmail.com", "jessicacristianebtr@gmail.com", "joao_usercon@hotmail.com", "larissaribeiro03@hotmail.com", "leo_o_nardo1@outlook.com", "lucas.00.santos@outlook.com", "mari_oli25@hotmail.com", "pathsilva09@gmail.com", "paula.leticia.braz@gmail.com", "raulogus2@gmail.com", "ricardomrfin@gmail.com", "thiagohdosanjos99@gmail.com", "vitoriagcf@hotmail.com", "william.xavier07@hotmail.com"}
		logico sexo[29]= {falso, verdadeiro, verdadeiro, verdadeiro, falso, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, verdadeiro, falso, falso, verdadeiro, falso, verdadeiro, verdadeiro, falso, falso, falso, verdadeiro, verdadeiro, verdadeiro, falso, verdadeiro}
		inteiro pontos[29]
		inteiro grupo, x, cod, ponto=0
		caracter perg1, entrega, sex
		
		escreva("\nGrupo 1:\n")
		para (x=0; x<10; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x])
		}
		//===================================================
		escreva("\n\nGrupo 2:\n")
		para (x=10; x<20; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x])
		}
		//===================================================
		escreva("\n\nGrupo 3:\n")
		para (x=20; x<29; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x])
		}
		//===================================================

		faca
		{
		
		escreva("\n\nSelecione o grupo para o qual quer atribuir nota: ")
		leia(grupo)
		limpa()
		
		se (grupo!==3 e grupo!==2 e grupo!==1)
		{
			faca
			{
				escreva("\nErro! Entre com o numero correto do grupo de 1 a 3: ")
				leia(grupo)
		
			}enquanto (grupo!==3 e grupo!==2 e grupo!==1)
			limpa()	
		}

		
			
		//=========================================================================================
		se (grupo==1)
		{
			escreva("Grupo 1:")
			para (x=0; x<10; x++)
			{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}				
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		PONTOS: ",pontos[x])
			}
		}
		//=========================================================================================
		senao se (grupo==2)
		{
			escreva("Grupo 2:")
			para (x=10; x<20; x++)
			{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}				
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		PONTOS: ",pontos[x])
			}
		}
		//=========================================================================================
		senao
		{
			escreva("Grupo 3:")
			para (x=20; x<29; x++)
			{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}				
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		PONTOS: ",pontos[x])
			}
		}
		//=========================================================================================

		//===================================================
		
			escreva("\nEntre com o codigo do(a) aluno(a): ")
			leia(cod)
			se (grupo==1)
			{
				se(cod<1 ou cod>10)
				{
					faca
					{
						escreva("ERRO!Entre com um codigo correto de 1 a 10: ")
						leia(cod)
					}enquanto (cod<1 ou cod>10)
				}
			}
			//================================
			senao se (grupo==2)
			{
				se(cod<11 ou cod>20)
				{
					faca
					{
						escreva("ERRO!Entre com um codigo correto de 11 a 20: ")
						leia(cod)
					}enquanto (cod<11 ou cod>20)
				}
			}
			//===================================
			senao
			{
				se(cod<20 ou cod>29)
				{
					faca
					{
						escreva("ERRO!Entre com um codigo correto de 20 a 29: ")
						leia(cod)
					}enquanto (cod<20 ou cod>29)
				}
			}
			//====================================
			escreva("\nEntregou a lição? ")
			leia(entrega)
			se (entrega=='s' ou entrega=='S')
			{
				pontos[cod-1]=pontos[cod-1]+1
			}
			senao
			{
				pontos[cod-1]=pontos[cod-1]
			}
		
		escreva("\nVocê deseja atribuir nota para mais algum grupo? ")
		leia(perg1)
		
		}enquanto (perg1=='s' ou perg1=='S' ) 
		limpa()
		
//===========================================================================
		escreva("\nGrupo 1:\n")
		para (x=0; x<10; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x],"		TOTAL DE PONTOS: ",pontos[x])
		}
		//===================================================
		escreva("\n\nGrupo 2:\n")
		para (x=10; x<20; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x],"		TOTAL DE PONTOS: ",pontos[x])
		}
		//===================================================
		escreva("\n\nGrupo 3:\n")
		para (x=20; x<29; x++)
		{
			se (sexo[x]==verdadeiro){
				sex='O'
			}
			senao
			{
				sex='A'
			}
			escreva("\nCODIGO: ",x+1,"	ALUN",sex,": ",nome[x],"		EMAIL: ",email[x],"		TOTAL DE PONTOS: ",pontos[x])
		}	

			escreva("\nFim do programa! TMJ!!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3035; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */