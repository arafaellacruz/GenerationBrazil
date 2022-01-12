programa
{
	
	funcao inicio()
	{
		inteiro  x, LD[10],soma=0,maiorValor=0
		real media=0.0

		para(x=0;x<10;x++)
		{
			
			escreva("\nInforme  o valor a ser lançado: ")			
			leia(LD[x])
			soma+=LD[x] 

			se(LD[x]==6)
			{
				maiorValor++
				
				}
						
		}
			media = soma / 10.0
			escreva("\nA média é : ", media)
			escreva("\nO valor 6 apareceu ",maiorValor," vez(es).")			
			}	


}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */