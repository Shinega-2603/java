public class DiviHackEarth {

    public static boolean isDivisible(int arr[], int n) {
        int lastDigit = arr[n - 1] % 10;
        if (lastDigit == 0)
            return true;

        return false;
    }


    public static void main(String[] arg) {
        int arr[] = {12, 65, 46, 37, 99};
        int n = arr.length;

        if (isDivisible(arr, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



