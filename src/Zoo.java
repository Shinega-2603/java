import java.util.Scanner;

public class Zoo {
    public static int x = 0;
    public static int y = 0;

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch[] = new char[20];
        ch = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'z') {

                x = x + 1;
            } else if (ch[i] == 'o') {
                y = y + 1;

            }
        }
        int end = 2 * x;
        if (end == y) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
