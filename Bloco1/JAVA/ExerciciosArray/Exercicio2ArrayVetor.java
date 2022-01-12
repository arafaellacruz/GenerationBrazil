package ExerciciosArray;

import java.util.Scanner;

public class Exercicio2ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[6];
		int x, somaPar = 0, somaImpar = 0, qtdImpar = 0;
		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 6; x++)
		{
			System.out.println("\nInforme os valores do vetor: ");
			array[x] = leia.nextInt();
			if (array[x] % 2 == 0)
			{
				somaPar += array[x];
			} 
			else 
			{
				somaImpar += array[x];
				qtdImpar++;
			}
		}
		
		for (x = 0; x < 6; x++)
		{
			if (array[x] % 2 == 0)
			{
				System.out.println("\nOs números pares são: "+array[x]);
				
			}
			else
			{
				System.out.println("\nOs números ímpares são: "+array[x]);
			}
			
		}
		
		System.out.println("\nA soma dos números pares é igual a: "+somaPar);
		System.out.println("\nA soma dos números ímpares é igual a: "+somaImpar);
		System.out.println("\nA quantidade de números ímpares é: "+qtdImpar);
		
	}

}
