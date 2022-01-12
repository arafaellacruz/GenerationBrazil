package LaçoCondicionalJAVA;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n=== Descubra a sua categoria === ");
		System.out.println("\nInforme a sua idade:");
		idade = leia.nextInt();
		
		if(idade<=10 && idade<=14)
		{
			System.out.println("\nSua categoria é INFANTIL.");
		}
		
		else if(idade<=15 && idade<=17)
		{
			System.out.println("\nSua categoria é JUVENIL.");
		}
		
		else if(idade<=18 && idade<=25)
		{
			System.out.println("\nSua categoria é ADULTO.");
		}
		
		else
		{
			System.out.println("\nIdade não compatível com nenhuma das categorias.");
		}
	}
}	

		
