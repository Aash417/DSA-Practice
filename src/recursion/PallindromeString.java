package recursion;

public class PallindromeString {
    public static void main(String[] args) {
        String s = "geek";
        int end = s.length() - 1;
        System.out.println(ispallindrome(s, 0, end));
    }

    public static boolean ispallindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        return ((s.charAt(start) == s.charAt(end)) && ispallindrome(s, start + 1, end - 1));
    }
}
