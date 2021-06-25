//Data de Última alteraçao: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_2;

import java.util.Comparator;

public class Exercicio4 implements Comparator < Produto > {

	@Override
	public int compare(Produto po1, Produto po2) {
		return po1.getNome().compareTo(po2.getNome());
	}

}