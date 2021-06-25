//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_1;

public class Jogador {

	private String nome;
	private Integer idade;
	private Integer numero;

	public Jogador() {

		this.nome = "";
		this.idade = 0;
		this.numero = 0;

	}

	public Jogador(String nome, Integer idade, Integer numero) {

		this.nome = nome;
		this.idade = idade;
		this.numero = numero;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String toString() {
		return "Jogador [nome=" + nome + ", idade=" + idade + ", numero=" + numero + "]";
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (this == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Jogador other = (Jogador) obj;

		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;

		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;

		return true;
	}

	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());

		return result;
	}

}