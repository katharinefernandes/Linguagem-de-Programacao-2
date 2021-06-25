//Data de Última alteração: 02/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package lista1;

import java.util.HashSet;
import java.util.Scanner;

public class Palavrinhas {

  public static void main(String[] args) {

    Scanner open = new Scanner(System.in);

    HashSet < String > lista = new HashSet < String > ();

    String palavra = "";

    System.out.println("Digite palavras ou fim para encerrar: ");

    do {

      palavra = open.next();

      if (!palavra.equals("fim")) {
        lista.add(palavra);
      }
    } while (!palavra.equals("fim"));

    System.out.println("Novamente, Digite palavras ou fim para encerrar: \n\n");

    do {

      palavra = open.next();

      if (!palavra.equals("fim")) {
        if (lista.contains(palavra))
          System.out.println(palavra + " - Localizado");
        else
          System.out.println(palavra + " - Não Localizado");
      }

    } while (!palavra.equals("fim"));

    open.close();

  }
}