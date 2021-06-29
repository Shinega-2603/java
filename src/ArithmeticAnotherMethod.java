import java.util.Scanner;

public class ArithmeticAnotherMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        System.out.println("enter the values");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (Arithmetic(arr)) {
            System.out.println("Arithmetic");
        } else if (Geometric(arr)) {
            System.out.println("Geometric");
        } else {
            System.out.println("-1");
        }

    }

    private static boolean Arithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return false;
            }
        }

        return true;
    }

    private static boolean Geometric(int[] arr) {
        int div = arr[1] / arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] / arr[i] != div) {
                return false;
            }
        }
        return true;
    }
}
