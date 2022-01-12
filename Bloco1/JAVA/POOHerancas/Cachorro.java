package Exerc�cioHeranca;

public class Cachorro extends Animal {
	
	private String correr;
	
	
	public Cachorro(String nome, int idade, String som, String correr2) {
		super(nome, idade, som);
		this.correr = correr;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimir()
	{
		System.out.println("\n=== Informa��es do cachorro === \nNome: "+nome+"\nIdade: "+idade+ " anos. \nSom: "+som+"\nA��o: "+correr);
	}

}
