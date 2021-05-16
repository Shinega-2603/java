

public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {5, 2, 10, 6, 8, 9};
        int highest = a[0];
        int secondHighest = a[1];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > highest) {


                secondHighest = highest;


                highest = a[i];
            } else if (a[i] > secondHighest && a[i] != highest)

                secondHighest = a[i];
        }
        System.out.println(secondHighest);
    }
}
