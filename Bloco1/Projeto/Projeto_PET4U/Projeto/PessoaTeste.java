package Projeto;

	import java.util.*;

	public class PessoaTeste {

		public static void main(String []args)
		{
			Scanner leia = new Scanner(System.in);
			Pessoa pessoa1 = new Pessoa (null, null, null, null , null, null, null);
			String nome, sobrenome, genero, idade, cpf, telefone, endereco;
			
			
			System.out.println("\nQual � o seu nome?");
			nome = leia.next();
			pessoa1.setNome(nome);
			System.out.println("\nQual � o seu sobrenome?");
			sobrenome = leia.next();
			pessoa1.setSobrenome(sobrenome);
	    	System.out.println("\nInforme o seu g�nero.");
	        genero = leia.next();
	        pessoa1.setGenero(genero);
	        System.out.println("\nQual � a sua idade?");
	        idade = leia.next();
	        pessoa1.setIdade(0);
	        System.out.println("\nQual � o seu CPF?");
	        cpf = leia.next();
	        pessoa1.setCpf(0);
	        System.out.println("\nQual � o seu telefone: ");
	      	telefone = leia.next();
	      	pessoa1.setTelefone(telefone);      	
	      	System.out.println("\nInforme seu endere�o."); 
	        endereco = leia.next();
	      	pessoa1.setEndereco(endereco);
	      	  	
		}
		
	}
