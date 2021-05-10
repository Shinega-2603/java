public class mirror {
    public static void main(String[] args) {
//        mirr();
        num();
    }

    public static void mirr() {
        String s = "abfr";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int n = (122 - a) + 97;
            char m = (char) n;
            System.out.print(m);

        }
    }

    public static void num() {
        int[] arr = {2, 4, 3, 0};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((i == 0 && arr[j] != 0) || (i != 0)) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
//        public static void Maxnum(){
//            int[] arr = {0, 2, 0, 1};
//            int temp = 0;
//            int n=arr.length;
//            for (int i = 0; i < n; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    if((i==(n-1) && arr[j]!0)||(i!=n)){
//                    if (arr[i] < arr[j]) {
//                        temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                    }
//                }
//
//            }
//            for ( i = 0; i < arr.length; i++)
//                System.out.println(arr[i]);
//
}



