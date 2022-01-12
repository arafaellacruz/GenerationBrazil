package POO;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Rafaella Cruz");
		f1.setSalario(50000);
		f1.setCargo("Agent II");
		f1.setAnoDeContratação(2020);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getSalario());
		System.out.println(f1.getCargo());
		System.out.println(f1.getAnoDeContratação());
	}

}
