package ExerciciosLacoDeDecisao;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInforme o 1� n�mero:");
		n1 = leia.nextInt();
		System.out.println("\nInforme o 2� n�mero:");
		n2 = leia.nextInt();
		System.out.println("\nInforme o 3� n�mero:");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nO maior valor �: "+n1);
		}
		
		if(n2>n1 && n2>n3)
		{
			System.out.println("\nO maior valor �: "+n2);
		}
		
		if(n3>n2 && n3>n1)
		{
			System.out.println("\nO maior valor �: "+n3);
		}
		
		

	}

}
