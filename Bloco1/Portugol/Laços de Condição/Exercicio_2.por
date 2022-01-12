programa
{
	
	funcao inicio()
	{
		real N,HE,SN,ST,SE
		cadeia C

		escreva(" === CÁLCULO SALARIAL === ")
		escreva("\nInforme seu código de operário: ")
		leia(C)
		escreva("\nInforme o número de horas trabalhadas: ")
		leia(N)

		se(N > 50.0)
		{
			HE = N - 50.0
			SE = HE * 20.0
			SN = 50 * 10.0
			ST = SN + SE

		}

		senao
		{
			SE = 0
			SN = N * 10
			ST = SN
		}

		escreva("\nVocê receberá R$ ",SE," referente as horas excendentes.")
		escreva("\nVocê receberá R$ ",ST," referente ao salário total.")


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */