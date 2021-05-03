public class homework3 {
    public static void main(String[] args) {
//      contVowels();
//      countWords();
//        palindrome();
//        sumArray();
//        evenOdd();
        numWord();
    }

    public static void contVowels() {
        String b = "periasamy";
        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' ||
                    b.charAt(i) == 'o' || b.charAt(i) == 'u' || b.charAt(i) == 'A' ||
                    b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U') {

                count += 1;
            }

        }
        System.out.println(count);
    }

    public static void countWords() {
        String c = "A Transformation in Education";
        int count = 1;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == ' ') {

                count += 1;
            }

        }
        System.out.println(count);
    }

    public static void palindrome() {
        String s = "stats";
        String temp = "";
        int slength = s.length();
        for (int i = slength - 1; i >= 0; --i) {
            temp = temp + s.charAt(i);
        }
        if (s.equals(temp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void sumArray() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void evenOdd() {
        int[] arr = {1, 2, 8, 4, 6};
        int temp = 0;
        int even_average = 0;
        int set = 0;
        int odd_average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp = temp + arr[i];
                even_average += 1;
            } else {
                if (arr[i] % 2 != 0) {
                    set = set + arr[i];
                    odd_average += 1;
                }
            }
        }
        System.out.println("even average" + ":" + even_average);
        System.out.println("odd average" + ":" + odd_average);
    }

    public static void numWord() {
        int s = 3987;
        String a = String.valueOf(s);

        for (int i = 0; i < a.length(); i++) {

            switch (a.charAt(i)) {
                case '0':
                    System.out.print("Zero" + " ");

                    break;
                case '1':

                    System.out.print("One" + " ");

                    break;
                case '2':

                    System.out.print("Two" + " ");

                    break;
                case '3':
                    System.out.print("Three" + " ");
                    break;
                case '4':
                    System.out.println("Four" + " ");
                    break;
                case '5':
                    System.out.println("Five" + " ");
                    break;
                case '6':
                    System.out.println("Six" + " ");
                    break;
                case '7':
                    System.out.println("Seven" + " ");
                    break;
                case '8':
                    System.out.println("Eight" + " ");
                    break;
                case '9':
                    System.out.println("Nine" + " ");
                    break;
            }
        }
    }
}
