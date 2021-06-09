import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> name = new HashMap<>();
        while (true) {
            String a = (sc.nextLine()).trim();
            String b = sc.nextLine();
            if (a.equals("Q")) {
                break;

            }
            name.put(a, b);
        }
        for (Map.Entry<String, String> map : name.entrySet()) {

            System.out.println(map.getKey() + " : " + map.getValue());

            Security(map.getKey(), map.getValue());
        }
//        Security(map.get);
    }

    public static void Security(String a, String b) {
        int length1 = a.length();
        int length2 = b.length();
        String s = " ";
        try {
            if (length1 > 5) {
                for (int i = 0; i < 5; i++) {
                    s += s.charAt(i);
                }
            }
            int sum = 0;
            int average = 0;
            for (int i = 0; i < length2; i++) {
                int c = b.charAt(i);
                int k = (int) c;
                sum += k;
                average = sum / b.length();
            }
            System.out.println("key : " + s + average);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
