import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
//      subString();
        date();
    }

    public static void date() {
        String a = "2020-05-01";
        String[] arr = a.split("-");

        switch (arr[1]) {
            case "01" -> System.out.println(arr[2] + " " + "January, " + arr[0]);

            case "02" -> System.out.println(arr[2] + " " + "February, " + arr[0]);
            case "03" -> System.out.println(arr[2] + " " + "March, " + arr[0]);

            case "04" -> System.out.println(arr[2] + " " + "April, " + arr[0]);

            case "05" -> System.out.println(arr[2] + " " + "May, " + arr[0]);

            case "06" -> System.out.println(arr[2] + " " + "June, " + arr[0]);

            case "07" -> System.out.println(arr[2] + " " + "July, " + arr[0]);

//            case "08":
//                System.out.println(arr[2]+" "+"August, "+arr[0]);
//                break;
//            case "09":
//                System.out.println(arr[2]+" "+"September, "+arr[0]);
//                break;
//            case "10":
//                System.out.println(arr[2]+" "+"October, "+arr[0]);
//                break;
//            case "11":
//                System.out.println(arr[2]+" "+"November, "+arr[0]);
//                break;
//            case "12":
//                System.out.println(arr[2]+" "+"December, "+arr[0]);
//                break;
        }


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
