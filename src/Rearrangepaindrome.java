import java.util.Scanner;

public class Rearrangepaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String substring = sc.nextLine();
        for (int i = 0; i < substring.length(); i++) {
            String a = "";
            for (int j = i; j < substring.length(); j++) {
                a += substring.charAt(j);
                String reverse = "";
                if (a.length() > 1) {
                    for (int k = a.length() - 1; k >= 0; k--) {
                        reverse += a.charAt(k);
                    }
                }
                if (reverse.equals(a)) {
                    System.out.println(a + " is palindrome");
                    break;
                }
            }
        }
    }
}
