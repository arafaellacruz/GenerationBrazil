package ExercicioPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Aurora Sofia", 2, "Au Au Auuuu", "A cachorra est� correndo");
		Cavalo cavalo = new Cavalo("Whisper", 7, "Pocot� pocot�", "O cavalo est� correndo");
		Preguica preguica = new Preguica("Docinho", 3, "AAAA", "A pregui�a docinho est� subindo nas �rvores.");

		System.out.println("\n=== DADOS DOS ANIMAIS ===");
		System.out.println("\nAnimal: " + cachorro.getNomeDaClasse() + "\nO nome �: " + cachorro.getNome()
				+ "\nCom a idade de: " + cachorro.getIdade() + " anos.\nSom emitido: " + cachorro.getSom()
				+ "\nA��o: " + cachorro.getAcao());
		System.out.println("\nAnimal: " + cavalo.getNomeDaClasse() + "\nO nome �: " + cavalo.getNome()
				+ "\nCom a idade de: " + cavalo.getIdade() + " anos.\nSom emitido: " + cavalo.getSom()
				+ "\nA��o: " + cavalo.getAcao());
		System.out.println("\nAnimal: " + preguica.getNomeDaClasse() + "\nO nome �: " + preguica.getNome()
				+ "\nCom a idade de: " + preguica.getIdade() + " anos.\nSom emitido: " + preguica.getSom()
				+ "\nA��o: " + preguica.getAcao());
		System.out.println("\nFim do programa. Todos as informa��es foram exibidas.");
	}

}
