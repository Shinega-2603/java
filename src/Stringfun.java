import java.util.Scanner;

public class Stringfun {
    public static void main(String[] args) {
        String k1 = "hellohiiii";
        String k2 = "am";
//      replace(k1);
//      compareTo(k1,k2);
//        isEmpty(k1);
//        System.out.println(isEmpty(k1));
//        isEqual(k1,k2);
//        trimString(k1);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the startIndex");
        System.out.println("enter the endIndex");
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        subString(k1, startIndex, endIndex);
//


    }

    //    public static void replace(String k1){
//     String k2="";
//    for(int i=0;i<k1.length();i++)
//        {
//            if(k1.charAt(i)=='l')
//            {
//                k2+='k';
//            }
//            else
//            {
//                k2+=k1.charAt(i);
//            }
//
//        }
//        System.out.println(k2);
//    }
//    public static void compareTo(String k1,String k2){
//        String k3="hello";
//        String k4="am";
//
//        for(int i=0;i<k3.length();i++)
//        {
//            if(k1.charAt(i)!=k4.charAt(i)) {
//                System.out.println(k3.charAt(i) - k4.charAt(i));
//                break;
//            }
//            else
//                for( i=0;i<k4.length();i++)
//                {
//                    if(k4.charAt(i)!=k3.charAt(i))
//                        System.out.println(k4.charAt(i)-k3.charAt(i));
//                    break;
//                }
//        }
//    }
//    public static boolean isEmpty(String k3){
//         k3="";
//        if(k3=="") {
//            return true;
//
//        }
//        else {
//            return false;
//        }
//
//    }
//    public static boolean isEqual(String k3,String k4){
//        String k3="hello";
//        String k4="am";
//        for(int i=0;i<k3.length();i++)
//        {
//            if(k3.charAt(i)!=k4.charAt(i))
//            {
//                return false;
//            }
//            else
//                return true;
//        }
//    }
//    public static void trimString(String s1) {
//        s1 = "     hello hi     ";
//
//        int startIndex = 0;
//        int endIndex = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) != ' ') {
//                startIndex = i;
//                break;
//            }
//
//        }
//        System.out.println(startIndex);
//
//        for (int i = s1.length() - 1; i > 0; i--) {
//            if (s1.charAt(i - 1) != ' ') {
//                endIndex = i;
//                break;
//            }
//
//        }
//        System.out.println(endIndex);
//        System.out.println(s1.substring(startIndex, endIndex));
//    }
    public static void subString(String s1, int startIndex, int endIndex) {

        String a = "";
        for (int i = startIndex; i < endIndex; i++) {
            a += s1.charAt(i);

        }
        System.out.println(a);
    }

    }

