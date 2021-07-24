import java.util.Scanner;

public class Lengthstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int finCount = 0;

        for (int i = 0; i < str.length(); i++) {
            String temp = "" + str.charAt(i);
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    temp += str.charAt(j);
                    count++;
                } else break;
            }
//            System.out.println(temp);
            if (finCount < count) {
                finCount = count;
            }
        }
        System.out.println(finCount);
    }
}




