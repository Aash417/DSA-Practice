package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 5;
        towerOfH(n, 'a', 'b', 'c');
    }

    public static void towerOfH(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        towerOfH(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        towerOfH(n - 1, B, A, C);
    }
}
