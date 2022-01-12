package ExercicioPolimorfismo;

public class Preguica extends BaseAnimal implements Animal {

	Preguica(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		nomeDaClasse = "preguica";
	}

	@Override
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getSom() {
		return som;
	}

	public String getAcao() {
		return acao;
	}

}
