import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class HashSet {
    public static void main(String[] args) {
//        uniquSet();
        mas();
    }

    public static void uniquSet() {
        Scanner sc = new Scanner(System.in);

        java.util.HashSet<Character> hashSet = new LinkedHashSet<>();
        char[] arr = {'m', 'a', 's', 'a', 'i', 's', 'c', 'h', 'o', 'o', 'l'};

        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);

        }
        System.out.println(hashSet);
    }

    public static void mas() {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> hashSet = new LinkedHashMap<>();
        String a = "masai school";
        int count;
        for (int i = 0; i < a.length(); i++) {
            count = 0;
            for (int j = 0; j < a.length(); j++) {

                if (a.charAt(i) == a.charAt(j)) {

                    count += 1;
//
                }
//

//
            }
            hashSet.put(a.charAt(i), count);

        }

        System.out.println(hashSet);
    }

}

