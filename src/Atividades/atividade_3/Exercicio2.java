//Data de Última alteração: 28/07/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 313 - B

package atividade_3;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Exercicio2 {

  public static void main(String[] args) {

      FileWriter maior = null;
      FileWriter menor = null;

      try(FileReader in = new FileReader("entrada.txt")) {

        maior = new FileWriter("maior.txt");
        menor = new FileWriter("menor.txt");

        int b;

         while( (b = in.read() ) != -1){

            if(b > 128) {
              System.out.println("Maiores que 128:" + b);
              maior.write(b);
            } 
            else if(b <= 128) {
              System.out.println("Menores ou iguais a 128:" + b);
              menor.write(b);
           }
          }
      }
      catch (IOException e) {
          e.printStackTrace();
      }
      finally {
  		try {
  		maior.close();
  		menor.close();
  		}
  		catch (IOException e) {
  			e.printStackTrace();
  		}
  	}
  }
}