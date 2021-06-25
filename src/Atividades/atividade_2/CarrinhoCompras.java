//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_2;

import java.util.ArrayList;

public class CarrinhoCompras {

	public ArrayList < Produto > lista;

	public CarrinhoCompras() {
		this.lista = new ArrayList < Produto > ();
	}

	public CarrinhoCompras(ArrayList < Produto > lista) {
		this.lista = lista;
	}

	public void incluir(Produto x) {
		this.lista.add(x);
	}

	public void remover(Produto x) {
		this.lista.remove(x);
	}

	public void listar() {

		double total = 0.0;

		if (lista.isEmpty()) {
			System.out.println("\nN�o h� itens em sua lista");
		} else {
			for (Produto produto: lista) {
				System.out.println(produto.toString());
				total += produto.getPreco();
			}

			System.out.println("\nSua lista possui itens. \nO total para pagar eh: " + total);

		}
	}

}