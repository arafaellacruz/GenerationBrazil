package POO;

public class TesteAviao {
	public static void main(String[] args) {
		
		/*
		 *  Estanciar seria puxar a Classe que você criou para onde você vai executar
		 *   (onde tem o main), e ai você tem que criar um "novo nome" pra classe, mas 
		 *   somente o nome sera mudado, ela vai respeitar tudo que você criou dentro do Pessoa
		 */

		Aviao Plane = new Aviao ("Turbinexx","médio","2000");
		Plane.imprimirInfo();
	}

}
