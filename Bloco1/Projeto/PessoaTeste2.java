package Projeto;

import java.util.Scanner;

public class PessoaTeste2 {

	
		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			String nome = "", sobrenome = "", genero = "", telefone = "", endereco = "", cpf = "";
			int idade = 18;
			Pessoa2 pessoa1 = new Pessoa2(nome, sobrenome, genero, idade, cpf, telefone, endereco);

			
			System.out.println("\n=================   BEM-VINDE A PET4U  =================");
			System.out.println("\nVoc� est� cada vez mais perto do seu PET! Mas antes, queremos te conhecer um \r\n"
					+ "pouquinho, nos fale quem � voc� para podermos apresentar nossas op��es:");
			System.out.println("\nQual � o seu nome?");
			nome = leia.next();
			pessoa1.setNome(nome);
			System.out.println("\nQual � o seu sobrenome?");
			sobrenome = leia.next();
			pessoa1.setSobrenome(sobrenome);
			System.out.println("\nInforme o seu g�nero:");
			genero = leia.next();
			pessoa1.setGenero(genero);
			System.out.println("\nQual � a sua idade?");
			idade = leia.nextInt();
			pessoa1.setIdade(idade);
			System.out.println("\nQual � o seu CPF? **Entre apenas com n�meros**");
			cpf = leia.next();
			pessoa1.setCpf(cpf);
			System.out.println("\nQual � o seu telefone? **Entre apenas com n�meros**");
			telefone = leia.next();
			pessoa1.setTelefone(telefone);
			leia.nextLine();
			System.out.println("\nInforme seu endere�o:");
			endereco = leia.nextLine();
			pessoa1.setEndereco(endereco);
			
			if (idade<18)
			{
				System.out.println("\nInfelizmente, "+nome+" "+sobrenome+ " voc� ainda n�o possui idade o suficiente para adotar um amic�o na PET4U. "
						+ "Assim que completar 18 anos, estaremos esperando por voc�.");
			}
			else
			{
			pessoa1.imprimirInfo();
	        leia.close();
			}
		}

	}
