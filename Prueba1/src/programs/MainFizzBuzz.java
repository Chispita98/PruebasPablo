/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

import java.util.Scanner;

/**
 *
 * @author pdelague
 */
public class MainFizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int a = 0;
        int b = 0;
        System.out.println("Introduce un numero entero:");
        a = reader.nextInt();
        System.out.println("Introduce otro entero mayor al anterior:");
        b = reader.nextInt();
        
        FizzBuzz fizzBuzz = new FizzBuzzAlgorithm(a, b);
        
        mostrar(fizzBuzz);
        
    }
    
    public static void mostrar(FizzBuzz op) { // metodo donde se invoca la implementacion abs de la interface definida en las operaciones
	System.out.println(op.algorithm().toString());	
    }   
    
}
