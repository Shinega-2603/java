import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Newaspire {
    public static void main(String[] args) {
        String s = "the gekes for gekes";

        String[] b = null;
        b = s.split(" ");
        Arrays.toString(b);
        String r = maxword(b);
        System.out.print(r);


//      stringrev();
//      maxchar();
//        minchar();
//        removeduplichar();
//        countduplicate();
//        maxword(b);
    }

    public static void stringrev() {
        String s = "I am IT student";
        String[] a = s.split("");
        String z = " ";
        for (int i = a.length - 1; i >= 0; i--) {
            z = z + a[i] + " ";
        }
        System.out.print(z);
    }

    public static void maxchar() {
        String s = "I am IT student";
        String c = s.toLowerCase();
        char[] a = c.toCharArray();
        int[] count = new int[s.length()];
        for (int i = 0; i < c.length(); i++) {
            count[i] = 1;
            for (int j = i + 1; j < c.length(); j++) {
                if (a[i] == a[j] && a[i] != ' ' && a[i] != '0') {
                    count[i]++;

                    a[j] = '0';
                }
            }
        }
        int max = 0;
        char charmax = c.charAt(0);
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                charmax = a[i];
            }
        }
        System.out.print(max + " " + charmax);
    }

    public static void minchar() {
        String s = "get toog";
        char[] d = s.toCharArray();
        int[] count = new int[s.length()];
        for (int i = 0; i < d.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < d.length; j++) {
                if (d[i] == d[j] && d[i] != ' ' && d[i] != '0') {
                    count[i]++;

                    d[j] = '0';
                }
            }
        }
        int min = 0;
        char charmin = s.charAt(0);
        for (int i = 0; i < count.length; i++) {
            if (min > count[i] && count[i] != '0') {
                min = count[i];
                charmin = d[i];
            }
        }
        System.out.print(min + " " + charmin);
    }

    public static void removeduplichar() {
        String s = "Hello hi";
        String a = s.toLowerCase();
        char[] z = a.toCharArray();
        int count = 0;
        for (int i = 0; i < z.length; i++) {

            int j;
            for (j = 0; j < i; j++) {
                if (z[i] == z[j]) {
                    break;
                }
            }
            if (j == i) {
                z[count++] = z[i];
            }
        }
        System.out.print(String.valueOf(Arrays.copyOf(z, count)));
    }

    public static void countduplicate() {
        String s = "Hello hiii";
        String a = s.toLowerCase();
        char[] c = a.toCharArray();
        int[] count = new int[a.length()];
        for (int i = 0; i < c.length; i++) {
            count[i] = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != ' ' && c[i] != '0') {
                    count[i]++;

                    c[j] = '0';
                }
            }

        }
        int max = 0;
        char charmax = a.charAt(0);
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                charmax = c[i];
            }
            System.out.print(max);
        }

    }

    public static String maxword(String[] b) {
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < b.length; i++) {
            if (h.containsKey(b[i])) {
                h.put(b[i], h.get(b[i]) + 1);
            } else {
                h.put(b[i], 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = h.entrySet();
        String n = " ";
        int value = 0;
        for (Map.Entry<String, Integer> m : set) {
            if (m.getValue() > value) {
                value = m.getValue();
                n = m.getKey();
            }
        }
        return n;

    }
}
