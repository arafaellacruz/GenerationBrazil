package ExercicioPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Aurora Sofia", 2, "Au Au Auuuu", "A cachorra está correndo");
		Cavalo cavalo = new Cavalo("Whisper", 7, "Pocotó pocotó", "O cavalo está correndo");
		Preguica preguica = new Preguica("Docinho", 3, "AAAA", "A preguiça docinho está subindo nas árvores.");

		System.out.println("\n=== DADOS DOS ANIMAIS ===");
		System.out.println("\nAnimal: " + cachorro.getNomeDaClasse() + "\nO nome é: " + cachorro.getNome()
				+ "\nCom a idade de: " + cachorro.getIdade() + " anos.\nSom emitido: " + cachorro.getSom()
				+ "\nAção: " + cachorro.getAcao());
		System.out.println("\nAnimal: " + cavalo.getNomeDaClasse() + "\nO nome é: " + cavalo.getNome()
				+ "\nCom a idade de: " + cavalo.getIdade() + " anos.\nSom emitido: " + cavalo.getSom()
				+ "\nAção: " + cavalo.getAcao());
		System.out.println("\nAnimal: " + preguica.getNomeDaClasse() + "\nO nome é: " + preguica.getNome()
				+ "\nCom a idade de: " + preguica.getIdade() + " anos.\nSom emitido: " + preguica.getSom()
				+ "\nAção: " + preguica.getAcao());
		System.out.println("\nFim do programa. Todos as informações foram exibidas.");
	}

}
