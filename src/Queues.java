import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            q.add(j);
            System.out.println(q.remove());


        }

    }
}
