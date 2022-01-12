programa
{
	
	funcao inicio()
	{
		real nota[5],pontuacao,maiorPontuacao=0.0
		inteiro x
		
		para(x=0;x<5;x++)
		{
			
			escreva("\nInforme a pontuação: ")
			leia(nota[x])

			se(nota[x]>maiorPontuacao)
			{
				maiorPontuacao = nota[x]
			}
			
			
		}
				para(x=0;x<5;x++)
			{
				escreva("\nA ",x+1," pontuação é: ",nota[x])				
			}
				
				escreva("\nA maior pontuação é igual a: ",maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nota, 6, 7, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */