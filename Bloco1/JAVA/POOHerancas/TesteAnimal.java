package Exerc�cioHeranca;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Aurora Sofia", 2, "Au Au Auuuu", "A cachorra est� correndo");
		Cavalo cavalo = new Cavalo ("Whisper", 7, "Pocot� pocot�", "O cavalo est� correndo");
		Preguica preguica = new Preguica ("Docinho", 3, "AAAA", "A pregui�a docinho est� subindo nas �rvores.");
		
		cachorro.imprimir();
		cavalo.imprimir();
		preguica.imprimir();
		
	}

}
