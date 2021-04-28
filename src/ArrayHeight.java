public class ArrayHeight {
    public static void main(String[] args) {
//          array();
//            ArrayHigh();
        ArrayLow();
    }

    public static void array() {
        int[] arr = {10, 3, 5, 16, 8};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(temp);
    }

    public static void ArrayHigh() {
        int[] arr = {10, 5, 16, 3, 8};
        int high = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int a = arr[i];
            int b = arr[i + 1];

            if (a > b) {
                if (high < a) {
                    high = a;
                }
            } else if (high < b) {
                high = b;
            }

        }
        System.out.println(high);
    }

    public static void ArrayLow() {
        int[] arr = {10, 5, 16, 3, 8};
        int low = arr[0];
        for (int i = 0; i < arr.length - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];

            if (a < b) {
                if (low > a) {
                    low = a;
                }
            } else if (low > b) {
                low = b;
            }

        }
        System.out.println(low);
    }
}
