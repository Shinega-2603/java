import java.util.Scanner;

public class Samp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1 : ");
        String a = sc.nextLine();
        System.out.println("Enter the string2 : ");
        String b = sc.nextLine();
        String c = "";

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                a.substring(i, j);
                if (a.substring(i, j).contains("a") || a.substring(i, j).contains("A")
                        || a.substring(i, j).contains("e") || a.substring(i, j).contains("E")
                        || a.substring(i, j).contains("i") || a.substring(i, j).contains("I")
                        || a.substring(i, j).contains("o") || a.substring(i, j).contains("O") ||
                        a.substring(i, j).contains("u") || a.substring(i, j).contains("U")) {
                    a.substring(i, j);
//                c=a.substring(i,j)+"";
                    c = c + a.substring(i, j) + "";
                    String d = "";
                    for (int k = 0; k < b.length(); k++) {
                        for (int l = k + 1; l <= b.length(); l++) {
                            b.substring(k, l);
                            if (b.substring(k, l).contains("a") || b.substring(k, l).contains("A")
                                    || b.substring(k, l).contains("e") || b.substring(k, l).contains("E")
                                    || b.substring(k, l).contains("i") || b.substring(k, l).contains("I")
                                    || b.substring(k, l).contains("o") || b.substring(k, l).contains("O") ||
                                    b.substring(k, l).contains("u") || b.substring(k, l).contains("U")) {
                                b.substring(k, l);
                                d = b.substring(k, l);
                                if (c.equals(d)) {
                                    System.out.println(c);
                                }
                            }

                        }
                    }

                }

            }

        }
    }
}
