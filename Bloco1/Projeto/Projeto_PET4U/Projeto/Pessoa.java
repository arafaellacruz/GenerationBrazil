package Projeto;

public class Pessoa {

		// Mudei os atributos p/ protected pra podermos usar nas subclasses.
		protected String nome;
		protected String sobrenome;
		protected String genero;
		protected int idade;
		protected int cpf;
		protected String telefone;
		protected String endereco;
		
		
	    public Pessoa (String nome, String sobrenome, String genero, int idade, int cpf, String telefone, String endereco)
	    {
	    	this.nome = nome;
	    	this.sobrenome = sobrenome;
	    	this.genero = genero; 
	    	this.idade = idade;
	    	this.cpf = cpf;
	    	this.telefone = telefone;
	    	this.endereco = endereco;
	    }
	    
	        
	  	public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public int getCpf() {
			return cpf;
		}

	    public void setCpf(int cpf) {
		    this.cpf = cpf;
	    }

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}


		public void imprimirInfo()
	    {
	    	System.out.println("\n*****Bem vinde "+nome+" "+sobrenome+" ao PET4U! N�s estamos muito felizes por voc� querer fazer a diferen�a e formar uma "
	    			+ "fam�lia com nossos amic�os!*****");
	    	System.out.println("\nPodemos confirmar alguns dados antes de continuarmos?");
	    	System.out.println("\nSeu nome completo �:"+nome+" "+sobrenome);
	    	System.out.println("\nVoc� � do g�nero: "+genero);
	    	System.out.println("\nSua idade �: "+idade+ " anos.");
	      	System.out.println("\nSeu telefone �: "+telefone);
	      	System.out.println("\nSeu endere�o �: "+endereco);
	      	  	
	    }
		
	}


