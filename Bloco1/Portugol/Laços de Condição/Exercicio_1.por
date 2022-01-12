programa
{
	
	funcao inicio()
    {
        real P,E,M

        escreva("===== VERIFIQUE O VALOR A SER PAGO =====")
        escreva("\nInforme o peso dos tomates: ")
        leia(P)

        M = (P-50) * 4.0
        E = P - 50

        se(P>50)
        {
        	escreva("\nVocê está com ",E," quilos acima do permitido pelo regulamento do estado de São Paulo e deve pagar uma multa de R$ ",M,"0.")
        }

        senao se(P<50)
        {
        	escreva("\nVocê está dentro da quantidade permitida de tomates permitido pelo regulamento do estado de São Paulo, não é necessário pagamento de multa.")
        }
    


    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */