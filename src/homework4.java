import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
//      subString();
        date();
    }

    public static void date() {
        String a = "2020-06-01";
        String[] arr = a.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[0] + " " + "june," + arr[2]);
    }

    public static void subString() {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        String b = str.nextLine();


        for (int i = 0; i < a.length(); i++) {
            String s = "";
            for (int j = i; j < a.length(); j++) {
                s = s + a.charAt(j);
                if (s.equals(b)) {
                    System.out.println("True");
                    break;
                }
            }
        }
    }
}
