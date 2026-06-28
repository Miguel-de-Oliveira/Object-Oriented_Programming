package aulas.aula03ConstrutorEEncapsulamento.Produto;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Identificador: ");
		int codigo = input.nextInt();
		System.out.println("Descrição: ");
		String descricao = input.next();
		System.out.println("Preço de Custo: ");
		double precoCusto = input.nextDouble();
		
		Produto produto = new Produto(codigo, descricao, precoCusto);
		
		while(true) {
			System.out.println("Tipo de movimento [E/S/F]: ");
			char tipoMovimento = input.next().charAt(0);
			tipoMovimento = Character.toUpperCase(tipoMovimento);
			if(tipoMovimento=='E') {
				System.out.println("Quantidade: ");
				int quantidade = input.nextInt();
				produto.entradaProduto(quantidade);
			}
			else if(tipoMovimento=='S') {
				System.out.println("Quantidade: ");
				int quantidade = input.nextInt();
				if(produto.saidaProduto(quantidade)==false) {
					System.out.println("Saldo de estoque indisponível.");
				}
			}
			else if(tipoMovimento=='F') {break;}
			else {System.out.println("Tipo inválido.");}
		}
		double valorEstoque = produto.getEstoque()*produto.getPrecoCusto();
		System.out.printf("\nSaldo...........: %d", produto.getEstoque());
		System.out.printf("\nValor do estoque: R$ %.2f",valorEstoque);
		input.close();
		
	}

}
