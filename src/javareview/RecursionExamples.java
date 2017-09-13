/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

import java.util.Scanner;

/**
 *
 * @author Tewan2657
 */
public class RecursionExamples {
// 1. Function must make a call to itself 
// 2. Must have a base case    
// 3. Each step "must" go closer to the base case(ie. problem is getting smaller)    
    
    // Returns the nth Fibbonacci number 
    // n - the nth number we want in the sequence 
    public int fibloop(int n) {
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        //boundry condition fix
        if (n > 0) {
            numbers[1] = 1;
        }
        //building the sequence
        for (int i = 2; i < n + 1; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        //Returning the number
        return numbers[n];
    }

    //calculate the nth Fib number using recursion
    //n - the nth number in the sequence
    public int fibR(int n) {
        //Base Case 
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }


    }

    public int gcd(int a, int b) {
        //swap if a is a lower number 
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        //check if we are done
        if (b == 0) {
            return a;
        } else {
            //find new values for a and b 
            int r = a % b;
            //calculate new GCD
            return gcd(b, r);
        }

    }

    /**
     * @param args the command liFne arguments
     */
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number");

        RecursionExamples test = new RecursionExamples();

        //for loop 
        int bound1 = test.fibloop(0);
        bound1 = input.nextInt();
        //System.out.println("0th " + bound1);

        int bound2 = test.fibloop(1);
        System.out.println("1th " + bound2);

        int norm = test.fibloop(26);
        System.out.println("26th " + norm);

        System.out.println("------");

        //Recursion
        int boundR1 = test.fibR(0);
        System.out.println("0th " + boundR1);

        int boundR2 = test.fibR(1);
        System.out.println("1th " + boundR2);

        int norm1 = test.fibR(4);
        System.out.println("5th " + norm1);

        //GCD  TEST
        System.out.println("--------");
        System.out.println("GCD(1378,24)");
        int gcd = test.gcd(1378, 24);
        System.out.println(gcd);






    }
}
