programa
{
	
	funcao inicio()
	{
		inteiro N1,N2,N3,N4,Q1,Q2,Q3,Q4

		escreva("\nInforme o valor de A: ")
		leia(N1)
		escreva("\nInforme o valor de B: ")
		leia(N2)
		escreva("\nInforme o valor de C: ")
		leia(N3)
		escreva("\nInforme o valor de D: ")
		leia(N4)

		Q1 = N1 * N1
		Q2 = N2 * N2
		Q3 = N3 * N3
		Q4 = N4 * N4

		se(Q3>=1000)
		{
			escreva("O quadrado de C é ",Q3)
		}

		senao
		{
			escreva("\nO quadrado de A é: ",Q1)
			escreva("\nO quadrado de B é: ",Q2)
			escreva("\nO quadrado de C é: ",Q3)
			escreva("\nO quadrado de D é: ",Q4)
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */