import java.util.Scanner;

class samp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; a <= b; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            b--;
        }
    }
}

class Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % 10 == b % 10) {
            if (a > b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        } else if (b % 10 == c % 10) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (a % 10 == c % 10) {
            if (a > c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " 12" + c + " " + b);
            }
        }
    }
}

