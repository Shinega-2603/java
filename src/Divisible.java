import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        while (c) {
            char i = sc.next().charAt(0);

            switch (i) {
                case 'Y':
                    int n = sc.nextInt();
                    if (n % 5 == 0 && n % 7 == 0) {
                        System.out.println("Divisible by both the Numbers");
                    } else if (n % 5 == 0) {
                        System.out.println("Divisible by 5 Not Divisible by 7");
                    } else if (n % 7 == 0) {
                        System.out.println("Divisible by 7 Not Divisible by 5");
                    } else {
                        System.out.println("Not Divisible by both");
                    }
                    break;
                case 'N':
                    c = false;
                    System.out.println("Exit");
                    break;
            }
        }
    }
}
