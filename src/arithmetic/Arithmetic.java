/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double n = in.nextDouble();
        
        System.out.println("Enter second number:");
        double m = in.nextDouble();
        
        System.out.println("Enter arithmetic operation (PLUS, MINUS, TIMES, DIVIDE):");
        String operationString = in.next().toUpperCase(); // Read input as string
        
        Operation operation = Operation.valueOf(operationString); // Convert string to enum
        
        double result = r.calculate(n, m, operation);
        System.out.println("Result: " + result);
    }
}



