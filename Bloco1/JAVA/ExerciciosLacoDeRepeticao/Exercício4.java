package La�oCondicionalJAVA;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero,raiz,quadrado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o n�mero:");
		numero = leia.nextDouble();
		
		if(numero % 2 <= 0)
		{
			raiz = Math.sqrt(numero);
			System.out.println("\nA raiz quadrada do n�mero "+numero+" �: "+raiz);
		}
		
		else if(numero % 2 != 0)
		{
			quadrado = numero * numero;
			System.out.println("\nO quadrado do n�mero "+numero+" �: "+quadrado);
			
		}

	}

}
