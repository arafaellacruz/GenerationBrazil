package Exerc�ciosJAVA;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 ano -- 365 dias
		 * 1 m�s -- 30 dias
		 * 1 dia -- 1 dia
		 */
		Scanner leia = new Scanner(System.in);
		
		int anos,meses,dias,tempo;
		
		System.out.println("Informe quantos dias voc� j� viveu: ");
		tempo = leia.nextInt();
		anos = tempo / 365;
		meses = (tempo - (365 * anos)) / 30;
		dias = (tempo - (365 * anos)) %30;
		
		System.out.println("\nVoc� ja viveu: "+anos+" anos, "+meses+" meses e "+dias+" dias de vida.");
	
}
	
}
