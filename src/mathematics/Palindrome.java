package mathematics;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num) {
        if (num == 1) {
            return true;
        }
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            int lastdigit = temp % 10;
            reverse = reverse * 10 + lastdigit;
            temp = temp / 10;
        }
        return (num == reverse);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a no. to check plindrome :");
        int number = s.nextInt();
        s.close();
        boolean check = isPalindrome(number);
        if (check) {

            System.out.println("");
            System.out.println(number + "  is Palindrome.!");
            System.out.println("");

        } else {
            
            System.out.println("");
            System.out.println(number + "  is not Palindrome.!");
            System.out.println("");

        }
    }
}
