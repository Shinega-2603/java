import java.util.Scanner;

public class CoronoSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String a = sc.nextLine();
        VowelSubstring(a);

    }

    public static void VowelSubstring(String a) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                a.substring(i, j);
                if (a.substring(i, j).contains("a") && a.substring(i, j).contains("e") && a.substring(i, j).contains("i") && a.substring(i, j).contains("o") && a.substring(i, j).contains("u")) {
                    count++;
//                    System.out.println( a.substring(i, j));


                }

            }

        }
        System.out.println(count);

    }


}
