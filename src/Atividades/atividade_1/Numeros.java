//Data de Última alteração: 23/06/2021
//Aluna: Katharine Fernandes Viana Rodrigues 
//Prontuário: SP302718X
//Turma: 331 - B

package atividade_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Numeros {
    public static void main(String[] args){
        
    	Scanner sc = new Scanner(System.in);
        
    	ArrayList<Integer> lista = new ArrayList<Integer>();
    	
    		Integer x = 0;    	
	        Integer numero = 0;
	        Integer maior = 0;
	        Integer menor = 100;

        do{
            
        	System.out.println("Insira n�meros positivos, quando quiser finalizar digite 0: ");
            
        	numero = sc.nextInt();
        	
        	
        	if(numero < 0) {
        		
        		System.out.println("Insira apenas n�meros positivos");
        		
        	}
        	else if (numero != 0 && numero > 0){
                lista.add(numero);
            }
        	
            
        	if(numero > maior){
        		maior = numero;
            }
            
        	if(numero < menor){
        		menor = numero;
            }
            
        	if(numero != 0 && numero > 0){
                lista.add(numero);
            }
        	
        	
        }while(!numero.equals(0));

	        System.out.println("Voce cadastrou:" + lista.size());
	        System.out.println("O maior numero: "+ maior);
	        System.out.println("O menor numero: "+ menor);
    }
}