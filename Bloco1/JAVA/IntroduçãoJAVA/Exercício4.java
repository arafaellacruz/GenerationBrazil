package ExercíciosJAVA;

import java.util.Scanner;

public class Exercício4 {
	
	public static void main(String[] args) {
		
		int A,B,C,D,R,S;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Considerando a equação: D = (R + S) / 2, sendo que R = (A+B)^2 e S = (B+C)^2.");
		System.out.println("Informe o valor de A: ");
		A = leia.nextInt();
		System.out.println("Informe o valor de B: ");
		B = leia.nextInt();
		System.out.println("Informe o valor de C: ");
		C = leia.nextInt();
		System.out.println("Informe o valor de D: ");
		D = leia.nextInt();
		
				R = (A+B) * (A+B);
				S = (B + C) * (B + C);
				D = (R + S) / 2;
				
				System.out.println("O resultado é: "+D);
		
	}

}
