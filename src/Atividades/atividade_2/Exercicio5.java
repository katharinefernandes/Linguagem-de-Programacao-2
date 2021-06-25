//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_2;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		HashMap < String, LocalDate > Hp = new HashMap < String, LocalDate > ();

		int a;
		do {
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.println("-- Data de Nascimento --");
			System.out.print("Dia: ");
			Integer dia = ler.nextInt();
			System.out.print("M�s: ");
			Integer mes = ler.nextInt();
			System.out.print("Ano: ");
			Integer ano = ler.nextInt();

			LocalDate data = LocalDate.of(ano, mes, dia);

			Hp.put(nome, data);

			System.out.println("\n-- Gostaria de adicionar mais uma pessoa? --\n 0 - N�o\n 1 - Sim");
			a = ler.nextInt();
		} while (a == 1);

		Set < String > keys = Hp.keySet();

		for (String y: keys) {
			System.out.println(y + " - " + Hp.get(y));
		}

		ler.close();
	}

}