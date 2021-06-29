public class ArrayMaxMinUniq {
    public static void main(String[] args) {
//        pair();
//        uniquie();
//        max();
//        mas();
        masi();
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
        int flag;

        for (int i = 0; i < n; i++) {
            flag = 0;
            int j;
            for (j = 0; j < n; j++) {
                if ((i != j) && arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void max() {
        int[] arr = {1, 2, 6, 4, 9};
        int count = 1, ans = 0;
        for (int i = 0; i < arr.length; i++) {

            int flag = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = count++;
                    if (flag < count) {
                        ans = arr[i];
                    }

                }
            }
        }
        System.out.println(ans);
    }

    public static void mas() {
        String a = "masai School";
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

    public static void masi() {
        String str = "masai school";
        String b = " ";
        boolean flag = false;

        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            flag = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {
                        count += 1;
                    }

                }
            }
            System.out.println(str.charAt(i) + "-" + count);
        }
    }
}



