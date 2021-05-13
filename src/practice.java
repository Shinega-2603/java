import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        num();
//          reverse();
//        primefactor();
//        primeCount();
        palinDrome();
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

    public static void primefactor() {
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

    public static void primeCount() {
        int star = 67;
        int end = 90;
        int count = 0;
        int temp = 0;

        for (int i = star; i <= end; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;

                }
            }
            if (count == 2) {
                temp += 1;
//                System.out.println(temp);
            }
//            System.out.println(temp);
        }
        System.out.println(temp);
    }

    public static void palinDrome() {
        int start = 78;
        int end = 100;
        int temp = 0;
        int set = 0;
        for (int i = start; i <= end; i++) {
            temp = i;
            set = 0;
            while (temp != 0) {
                int rem = temp % 10;
                temp = temp / 10;
                set = set * 10 + rem;
            }
            if (i == set) {
                System.out.println(i);
            }
        }
    }
}
