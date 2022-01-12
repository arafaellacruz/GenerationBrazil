package ExercíciosJAVA;

import java.util.Scanner;

public class Exercício3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int tempo,S,M,H;
		String evento;
		
		System.out.println("==== EVENTO DE NATAL DA GENERATION ====");
		System.out.println("Qual a duração do evento em segundos? \nR:");
		tempo = leia.nextInt();
	
			S = tempo;
			M = S / 60;
			H = M / 60;
		
		System.out.println("\nO evento terá a duração de "+H+" horas, "+M+" minutos e "+S+" segundos.");
		

}

}