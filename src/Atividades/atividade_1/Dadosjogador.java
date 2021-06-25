//Data de Última alteração: 09/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_1;

import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;

public class Dadosjogador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList < Jogador > lista = new ArrayList < Jogador > ();

        String nome = "";
        Integer idade = 0;
        Integer numero = 0;

        do {
            System.out.println("Entre com o nome do jogador:\n");
            nome = sc.next();
            System.out.println("Entre com a idade do jogador:\n");
            idade = sc.nextInt();
            System.out.println("Entre com o numero do jogador:\n");
            numero = sc.nextInt();
            if (numero != 0) {
                Jogador j = new Jogador(nome, idade, numero);
                lista.add(j);
            }
        } while (!numero.equals(0));

        System.out.println("A lista eh: ");
        for (Jogador j: lista) {
            System.out.println("\n" + j);
        }
    }
}