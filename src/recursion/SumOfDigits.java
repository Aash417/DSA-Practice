package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfD(358));
    }

    public static int sumOfD(int n) {
        if (n == 0) {
            return 0;
        }
        int lastd = n % 10;

        return sumOfD(n / 10) + lastd;
    }
}
