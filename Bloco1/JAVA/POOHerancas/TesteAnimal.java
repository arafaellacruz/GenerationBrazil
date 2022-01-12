package ExercícioHeranca;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Aurora Sofia", 2, "Au Au Auuuu", "A cachorra está correndo");
		Cavalo cavalo = new Cavalo ("Whisper", 7, "Pocotó pocotó", "O cavalo está correndo");
		Preguica preguica = new Preguica ("Docinho", 3, "AAAA", "A preguiça docinho está subindo nas árvores.");
		
		cachorro.imprimir();
		cavalo.imprimir();
		preguica.imprimir();
		
	}

}
