package ExercicioPolimorfismo;

public class Cavalo extends BaseAnimal implements Animal {

	Cavalo(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		nomeDaClasse = "cavalo";
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
