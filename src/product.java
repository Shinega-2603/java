import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        int n, p = 1;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            p = p * a[i];
        }
        System.out.println(p);
    }
}

