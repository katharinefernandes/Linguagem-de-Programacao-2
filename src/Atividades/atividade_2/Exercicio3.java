//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_2;

public class Exercicio3 {

	public static void main(String[] args) {
		Produto produto1 = new Produto (11, "Fone de Ouvido Bluetooth", 120.00);
		Produto produto2 = new Produto (22, "Microfone", 899.90);
		Produto produto3 = new Produto (33, "Caixa de Som (Alexa)", 379.05);
		Produto produto4 = new Produto (44, "Carregador Port�til", 19.49);
		Produto produto5 = new Produto (55, "Case para Celular", 23.06);
		Produto produto6 = new Produto (66, "Cabo USB", 9.90);
		
		CarrinhoCompras c = new CarrinhoCompras();
		
		c.incluir(produto1);
		c.incluir(produto2);
		c.incluir(produto3);
		c.incluir(produto4);
		c.incluir(produto5);
		c.incluir(produto6);
		c.listar();
		
		c.remover(produto2);
		c.remover(produto4);
		c.remover(produto6);
		c.listar();
		
	}

}
