package Exerc�ciosJAVA;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1 ano -- 365 dias
		 * 1 m�s -- 30 dias
		 * 1 dia -- 1 dia
		 */
		Scanner leia = new Scanner(System.in);
		int anos,meses,dias,tempo;
		
		System.out.println("Quantos anos voc� viveu? \nR: ");
		anos = leia.nextInt();
		System.out.println("Quantos meses voc� viveu? \nR: ");
		meses = leia.nextInt();
		System.out.println("E quantos dias voc� viveu? \nR: ");
		dias = leia.nextInt();
		
		tempo = (anos * 365+(meses* 30 + dias));
		System.out.println("Considerando a medida de tempo em dias, voc� j� viveu : "+tempo+" dias.");

}
	
}
