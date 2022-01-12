package ExerciciosLacoDeDecisao;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o 1º número:");
		n1 = leia.nextInt();
		System.out.println("\nInforme o 2º número:");
		n2 = leia.nextInt();
		System.out.println("\nInforme o 3º número:");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nO maior valor é: "+n1);
		}
		
		if(n2>n1 && n2>n3)
		{
			System.out.println("\nO maior valor é: "+n2);
		}
		
		if(n3>n2 && n3>n1)
		{
			System.out.println("\nO maior valor é: "+n3);
		}
		
		

	}

}
