//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_2;

public class Produto {

	private Integer codigo;
	private String nome;
	private Double preco;

	public Produto() {

		this.codigo = 0;
		this.nome = "";
		this.preco = 0.0;
	}

	public Produto(Integer codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String toString() {
		return "- Produto [codigo = " + codigo + ", nome = " + nome + ", preco = " + preco + "]";
	}


}