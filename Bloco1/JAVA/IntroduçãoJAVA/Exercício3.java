package Exerc�ciosJAVA;

import java.util.Scanner;

public class Exerc�cio3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int tempo,S,M,H;
		String evento;
		
		System.out.println("==== EVENTO DE NATAL DA GENERATION ====");
		System.out.println("Qual a dura��o do evento em segundos? \nR:");
		tempo = leia.nextInt();
	
			S = tempo;
			M = S / 60;
			H = M / 60;
		
		System.out.println("\nO evento ter� a dura��o de "+H+" horas, "+M+" minutos e "+S+" segundos.");
		

}

}