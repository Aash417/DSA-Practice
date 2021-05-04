package recursion;

public class Print_1toN {
    public static void main(String[] args) {
     
       printNo(10); 
    }

    public static void printNo(int n) {
        
        if (n == 0) {
            return;
        }
        printNo(n-1);
        System.out.print(n+" ");
    }
}
