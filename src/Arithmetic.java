public class Arithmetic {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 18};
        int a = 0, g = 0;
        boolean arithmetic = true, geometric = true;

        int d = arr[1] - arr[0];
        int m = arr[1] / arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arithmetic = false;

            if (arr[i] + d == arr[i + 1]) {
                arithmetic = true;
            }

        }
        for (int j = 0; j < arr.length - 1; j++) {
            geometric = false;

            if (arr[j] * m == arr[j + 1]) {
                geometric = true;
            }
        }

        if (arithmetic) {
            System.out.println("Arithmetic sequence");
        } else if (geometric) {
            System.out.println("Geometric sequence");
        } else {
            System.out.println("-1");
        }
    }
}

