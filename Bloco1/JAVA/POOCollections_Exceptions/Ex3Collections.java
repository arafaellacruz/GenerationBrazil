package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3Collections {
	public static void main(String[] args) {

		int x;
		Scanner ler = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();

		do {
			System.out.println(" \n ==== ESTOQUE DE PRODUTOS ====");
			System.out.println(" \n Menu - Selecione a opção desejada: ");
			System.out.println(" \n 1. Adicionar produtos ao estoque.");
			System.out.println(" \n 2. Remover produtos do estoque.");
			System.out.println(" \n 3. Atualizar algum produto do estoque.");
			System.out.println(" \n 4. Visualizar os produtos disponíveis em estoque.");
			x = ler.nextInt();

			switch (x) {

			case 1:
				ler.nextLine();
				System.out.println("\nInforme o nome do produto que deseja adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;

			case 2:
				ler.nextLine();
				System.out.println("\nInforme o nome do produto que deseja remover do estoque: ");
				String remove = ler.nextLine();
				if (estoque.contains(remove)) {
					estoque.remove(remove);
				} else {
					System.out.println("\nProduto não encontrado.");
				}
				break;

			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar no estoque: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar do produto " + verifica + ": ");
				String novo = ler.nextLine();
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto não encontrado.");
				}
				System.out.println(estoque);
				break;

			case 4:
				System.out.println("\nOs produtos em estoque são: ");
				System.out.println("\n"+estoque);
				break;
				
			default:
				System.out.println("Opção inválida.");
				
			}

		} while (x != 0);

	}

}
