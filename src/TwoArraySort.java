import java.util.Scanner;

public class TwoArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int si = sc.nextInt();
        int[] a = new int[s];
        int[] b = new int[si];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < si; i++) {
            b[i] = sc.nextInt();
        }
        TwoArraySort t = new TwoArraySort();
        t.merge(a, b);
    }

    public static void merge(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                answer[k] = a[i];
                i++;
            } else {
                answer[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            answer[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            answer[k] = b[j];
            j++;
            k++;
        }

        for (k = 0; k < answer.length; k++) {
            System.out.print(answer[k] + " ");
        }

    }
}
