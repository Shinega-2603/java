import java.util.Scanner;

public class Prenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

    }

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char next_ch = s.charAt(i + 1);
            if (ch == '{') {
                if (next_ch == '[') {
                    if (next_ch == '(') {

                    }
                }
                return true;
            }
        }
        return false;
    }
}
