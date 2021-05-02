package mathematics;

import java.util.Scanner;

public class Factorial {
    // itteration
    public static int checkFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        int factorial = 1;
        int i=1;
        while (i <= num) {
            factorial = factorial*i;
            i++;
        }
        return factorial;
    }
    // recursive
    public static int checkFactorial2(int num) {
        if (num == 0) {
            return 1;
        }
        return num * checkFactorial2(num - 1); 
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. to find its Factorial :");
        int number = s.nextInt();
        s.close();
        
        System.out.println("");
        System.out.println("Using Itteration : Factorial of "+number+" is "+checkFactorial(number));
        
        System.out.println("");
        System.out.println("Using Recursion : Factorial of "+number+" is "+checkFactorial2(number));
    }
}
