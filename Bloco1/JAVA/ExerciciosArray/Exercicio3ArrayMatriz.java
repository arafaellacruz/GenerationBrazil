package ExerciciosArray;

import java.util.Scanner;

public class Exercicio3ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[3][3];
		int contador = 0, x;
		Scanner leia = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.println("Informe os valores da Matriz [3][3]: ");
				matriz[linha][coluna] = leia.nextInt();

				if (matriz[linha][coluna] > 10)

				{
					contador++;
				}

			}

		}

		System.out.printf("Há " + contador + " números maiores que 10 na matriz informada.");

	}

}
