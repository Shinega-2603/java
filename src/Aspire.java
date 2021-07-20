import java.util.ArrayList;
import java.util.List;

public class Aspire {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        String s=sc.nextLine();
//        reverse(a);
//        patt(a);
//        stringrev(s);
//        permu(s," ");
//        prime(a);
//        ar();
        sec();

    }

    public static void reverse(int n) {
        int num = n;
        int sum = 0;
        while (num != 0) {
            int revers = num % 10;
            sum = sum * 10 + revers;
            num = num / 10;
        }
        System.out.print(sum);

    }

    public static void patt(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * k + " ");
            }
            System.out.println();
            k = k + 2;
        }
    }

    public static void stringrev(String s) {
        String d[] = s.split("");
        String c = " ";
        for (int i = d.length - 1; i >= 0; i--) {
            c = c + d[i] + " ";

        }
        System.out.println(c);
    }

    public static void permu(String s, String a) {
        if (s.length() == 0) {
            System.out.print(a + " ");
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String per = s.substring(0, i) + s.substring(i + 1);
            permu(per, c + a);
        }
    }

    public static void prime(int n) {
        int m = n / 2;
        int flag = 0;
        if (n == 1 || n == 0) {
            System.out.print("not");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.print("not");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print("prime");
            }
        }
    }

    public static void ar() {
        int[] arr = {2, 4, 7, 8, 3, 6, 11};
        List<Integer> out = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            if (!(arr[i] == 0 || arr[i] == 1)) {
                int m = arr[i] / 2;
                for (int j = 2; j <= m; j++) {
                    if (arr[i] % j == 0) {
                        flag = 1;
                        break;
                    }
                }

            }
            if (flag == 0) {
                out.add(arr[i]);

            }
        }
        System.out.println(out);
    }

    public static void sec() {
        int[] arr = {3, 11, 13, 23, 5};
        int first = arr[0];
        int seco = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                seco = first;
                first = arr[i];
            } else if (arr[i] > seco && arr[i] < first) {
                seco = arr[i];
            }
        }
        System.out.print(seco);
    }
}
