import java.util.ArrayList;
import java.util.Scanner;

public class AlternatePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times want to run :");
        int time = sc.nextInt();

        while (time > 0) {

            System.out.println("Enter the string : ");
            String str = sc.next();
            int size = str.length();

            ArrayList<Character> list = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                char ch = str.charAt(j);
                if (list.contains(ch)) {
                    list.remove(list.indexOf(ch));

                } else {
                    list.add(ch);
                }

            }
            if (size % 2 == 0 && list.size() == 0) {
                System.out.println("Yes,it forms palindrome");
            } else if (size % 2 != 0 && list.size() == 1) {
                System.out.println("Yes,it form palindrome");
            } else {
                System.out.println("No,it cannot form palindrome");
            }
            time--;
        }

    }
}
