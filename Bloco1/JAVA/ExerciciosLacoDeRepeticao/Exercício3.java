package La�oCondicionalJAVA;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n=== Descubra a sua categoria === ");
		System.out.println("\nInforme a sua idade:");
		idade = leia.nextInt();
		
		if(idade<=10 && idade<=14)
		{
			System.out.println("\nSua categoria � INFANTIL.");
		}
		
		else if(idade<=15 && idade<=17)
		{
			System.out.println("\nSua categoria � JUVENIL.");
		}
		
		else if(idade<=18 && idade<=25)
		{
			System.out.println("\nSua categoria � ADULTO.");
		}
		
		else
		{
			System.out.println("\nIdade n�o compat�vel com nenhuma das categorias.");
		}
	}
}	

		
