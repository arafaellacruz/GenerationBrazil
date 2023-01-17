programa
{
	
	funcao inicio()
	{
		real sal,somaSal=0.0,mediaSal,mediaNf,maiorSal=0.0,perc
		inteiro nf,somaNf=0,cont100=0,x

	// 20 funcionários representa 100% da população
	//Cont100 ---- percentual de pessoas que recebem até R$ 100,00) 
	/// 5 ---- 100
	/// cont100 (quantidade de pessoas em números que recebe até R$ 100,00) ---- perc (representa a porcentagem do cont100), logo vai ficar: 5 * perc = cont100 * 100
	//// perc = (cont*100 * 100 / 5 )
	
	para(x=1;x<=5;x++)
	{
		escreva("\nDigite o seu salário: ")
		leia(sal)
		escreva("\nDigite o número de filhos: ")
		leia(nf)

		somaSal += sal // somaSal = somaSal + sal  x = x + 1
		somaNf = somaNf + nf

		se (maiorSal < sal)
		{
			maiorSal = sal
		}

		se(sal<=100)
		{
			cont100++ // cont100 = cont100 + 1
		}
		
	}

		mediaSal = somaSal / 5
		mediaNf = somaNf / 5.0 // está em amarelo por ter sido declarado como variavel real
		perc = (cont100 * 100.0) / 5 // está em amarelo por ter sido declarado como variavel real
		
		escreva("\nA média salárial é de: R$ ",mediaSal)
		escreva("\nA média de filhos de ",mediaNf)
		escreva("\nO maior salário é de R$ ",maiorSal) 
		escreva("\nO percentual de pessoas que recebem até R$ 100,00 é de: ",perc,"%.")
	
		
	}
}
