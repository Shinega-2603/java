public class ass {
    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        int[] arr = {8, 4, 6, 2, 1, 5, 3, 5};//1
        int n = arr.length;//1   o(1)
        for (int i = 0; i < n; i++) {  //n
            for (int j = 0; j < n; j++) { //n  o(n*n)
                if (arr[i] + arr[j] == 10 && i != j) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
