package recursion;

public class Print_Nto1 {
    public static void main(String[] args) {
        printNo(20);
    }
    public static void printNo(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+"  ");
        printNo(n-1);

    }
}
