public class ass {
    public static void main(String[] args) {
//        pair();
//        uniquie();
//        max();
        mas();
    }

    public static void pair() {
        int[] arr = {8, 4, 6, 2, 1, 5, 3, 5};//1
        int n = arr.length;//1   o(1)
        for (int i = 0; i < n; i++) {  //n
            for (int j = i + 1; j < n; j++) { //n  o(n*n)
                if (arr[i] + arr[j] == 10) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void uniquie() {
        int[] arr = {10, 20, 30, 10, 40, -2, 30};
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                temp = 1;
            }
        }
        System.out.println();
    }

    public static void max() {
        int[] arr = {0, 2, 6, 0, 9};
        int count = 1, ans;
        for (int i = 0; i < arr.length; i++) {
            int set = arr[i];
            int flag = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (flag < count) {
                ans = set;
                count = flag;
                System.out.println(ans);
            }
        }
    }

    public static void mas() {
        String a = "masaischool";
        int count;
        for (int i = 0; i < a.length(); i++) {
            count = 1;
            for (int j = 0; j < a.length(); j++) {
                if (i != j) {
                    if (a.charAt(i) == a.charAt(j)) {
                        count += 1;

                    }
                }
            }
            System.out.println(a.charAt(i) + "-" + count);
        }
    }
}

