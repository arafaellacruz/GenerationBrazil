package ExercicioPolimorfismo;

public class Cachorro extends BaseAnimal implements Animal {

	public Cachorro(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
		nomeDaClasse = "cachorro";
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
