import java.util.Scanner;
import java.util.Stack;

public class StackExamp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty()) {
                if (stack.peek() > arr[i]) {
                    System.out.println(stack.peek());
                    stack.push(arr[i]);
                    break;
                }

                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.println(0);
                stack.push(arr[i]);
            }
        }
    }
}
