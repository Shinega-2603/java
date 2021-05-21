
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework21 {
    public static void main(String[] args) {
//        has();
        arr();
    }

    public static void has() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Yogesh", 915678);
        hashMap.put("Nrupul", 512345);
        hashMap.put("Prateek", 213456);
        hashMap.put("Aman", 120987);
        hashMap.put("Madhukar", 987100);
        System.out.print("user=");
        String u = sc.nextLine();
        boolean flag = false;

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getKey().equals(u)) {
                flag = true;
                System.out.println(map.getValue());
                break;
            }


        }
        if (!flag)
            System.out.println("No user found");


    }

    public static void arr() {
        int[] a = {1, 2, -3, 4, 5};
        int[] index = {3, 2, 0};
        boolean flag = true;

        for (int i = 0; i < index.length; i++) {

            if (index[i] < a.length) {
                a[index[i]] = 0;

            } else {
                System.out.println("Array index out of bound");
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i : a) {
                System.out.print(i);
            }
        }

    }
}



