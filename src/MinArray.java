public class MinArray {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 3, 8, 3, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                int temp = n - arr[i];
                arr[i] += temp;
                count += temp;
            }
        }
        System.out.println(count);
    }
}
