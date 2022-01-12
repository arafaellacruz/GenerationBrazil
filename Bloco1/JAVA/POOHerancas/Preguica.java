package Exerc�cioHeranca;

public class Preguica extends Animal {
	
	private String subir;
	public Preguica(String nome, int idade, String som,String subir) {
		super(nome, idade, som);
		this.subir = subir;
	}
	public String getCorrer() {
		return subir;
	}
	public void setCorrer(String correr) {
		this.subir = correr;
	}
	
	public void imprimir()
	{
		System.out.println("\n=== Informa��es do pregui�a === \nNome: "+nome+"\nIdade: "+idade+" anos. \nSom: "+som+"\nA��o: "+subir);
	}

}