programa
{
	
	funcao inicio()
	{
		inteiro  linha,coluna
		real N1[4][6],N2[4][6],M1[4][6],M2[4][6]

		escreva("\nExercício 3 - Matrizes")
		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nEntre com os números da matriz 1: ")
				leia(N1[linha][coluna])
				escreva("\nEntre com os números da matriz 2: ")
				leia(N2[linha][coluna])
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
			}
		}

		para(linha=0;linha<4;linha++)
		{
			para(coluna=0;coluna<6;coluna++)
			{
				escreva("\nA soma é: ",M1[linha][coluna])
				escreva("\nA diferença é: ",M2[linha][coluna])
				
			}
		}

		
	}


}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {N1, 7, 7, 2}-{N2, 7, 16, 2}-{M1, 7, 25, 2}-{M2, 7, 34, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */