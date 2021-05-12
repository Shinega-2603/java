import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        num();
//          reverse();
        prime();
    }

    public static void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = sc.nextLine();
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int count = 0;
        if (number < 1) {
            System.out.println(number + " is not valid input");
        } else {
            for (int i = 1; i <= number; i++) {
                System.out.println(a);
                count++;
            }
        }
    }

    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 0) {
            int digit = a % 10;
            rev = rev * 10 + digit;
            a /= 10;
        }
        System.out.println(rev);

    }

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("star");
        int a = sc.nextInt();
        System.out.println("end");
        int b = sc.nextInt();
        int count = 1;
        for (int j = a; j < b; j++) {
            for (int i = 2; i < b; i++) {
                if (a % i == 0) {
                    System.out.print(count);
                    a = a / i;
                }
                count++;
            }
        }
        if (a > 2) {
            System.out.println(a);
        }
    }
}
