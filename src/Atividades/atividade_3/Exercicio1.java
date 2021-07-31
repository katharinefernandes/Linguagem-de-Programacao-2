//Data de Última alteração: 28/07/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 313 - B

package atividade_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]) {
		
		FileInputStream leitura = null;
			
		Scanner sc = new Scanner(System.in);
			
		leitura = null;
			
		do {
			System.out.println("Insira o nome de um arquivo: " );
			try {
					String nome = sc.nextLine();
					leitura = new FileInputStream(nome + ".txt");
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				} while(leitura == null);
				
				try {
					int b;
					
					while((b = leitura.read()) != -1) {
						System.out.println(b);
					}
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				  finally {
				        try {
				        leitura.close();
				        }
				        catch (IOException e) {
				            e.printStackTrace();
				        }
				    }
	  }
	}
