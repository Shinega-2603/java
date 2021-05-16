public class MaxMin {
    public static void main(String[] args) {
        int Max, Min, i;
        int arr[] = {32, 4, 78, 5, 78, 4, 9};
        int n = arr.length;
        Max = Min = arr[0];
        for (i = 1; i < n; ++i) {
            if (arr[i] > Max)
                Max = arr[i];

            if (arr[i] < Min)
                Min = arr[i];
        }

        System.out.println("Max:" + Max);
        System.out.print("Min:" + Min);
    }
}



