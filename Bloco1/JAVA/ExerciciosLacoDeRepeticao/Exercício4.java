package LaçoCondicionalJAVA;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero,raiz,quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número:");
		numero = leia.nextDouble();
		
		if(numero % 2 <= 0)
		{
			raiz = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do número "+numero+" é: "+raiz);
		}
		
		else if(numero % 2 != 0)
		{
			quadrado = numero * numero;
			System.out.println("\nO quadrado do número "+numero+" é: "+quadrado);
			
		}

	}

}
