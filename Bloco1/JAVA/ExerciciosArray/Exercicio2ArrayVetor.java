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
				System.out.println("\nOs n�meros pares s�o: "+array[x]);
				
			}
			else
			{
				System.out.println("\nOs n�meros �mpares s�o: "+array[x]);
			}
			
		}
		
		System.out.println("\nA soma dos n�meros pares � igual a: "+somaPar);
		System.out.println("\nA soma dos n�meros �mpares � igual a: "+somaImpar);
		System.out.println("\nA quantidade de n�meros �mpares �: "+qtdImpar);
		
	}

}
