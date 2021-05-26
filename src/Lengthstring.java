import java.util.Scanner;

public class Lengthstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        int n = sc.nextInt();

        while (n <= c) {

            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    System.out.println(s.substring(i, j));
                }
            }

        }
    }

}
