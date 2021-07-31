//Data de Última alteração: 28/07/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 313 - B

package atividade_3;

import java.util.Random;
import java.util.Arrays;
import java.io.IOException;
import java.io.FileWriter;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		FileWriter pares = null;
		FileWriter impares = null;
		
		Random random = new Random();	
			
		try { 
			
			pares = new FileWriter("pares.txt");
			impares = new FileWriter("impares.txt");
			
			for( int i = 0; i < 10; i++) { 	
				numeros[i] = random.nextInt(99) +1;
			}
				Arrays.sort(numeros);
			
			for( int i = 0; i < 10; i++) { 
				
				if( numeros[i] % 2 == 0) {
					pares.write(numeros[i]);
					System.out.println("Numeros pares: " + numeros[i]);
					
				}
				else {
					impares.write(numeros[i]);
					System.out.println("Numeros impares: " + numeros[i]);
				}
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		finally 
		{
			try {
				pares.close();
				impares.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			
			}
		}
	}
}

