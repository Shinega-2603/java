import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homework19 {
    public static void main(String[] args) {
//        has1();
        has2();
    }

    public static void has1() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nrupul", 32);
        hashMap.put("Prateek", 30);
        hashMap.put("Amen", 26);
        hashMap.put("Albert", 28);
        hashMap.put("Yokesh", 44);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            if (map.getValue() > 30) {

                System.out.println(map.getKey());
            }
        }
    }

    public static void has2() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList> hashMap = new HashMap<>();
        while (true) {
            ArrayList<String> list = new ArrayList<>();

            System.out.println("Enter the name:");
            String name = sc.nextLine();
            if (name.equals("-1")) {
                break;
            }
            while (true) {
                System.out.println("Enter the skills");
                String skill = sc.nextLine();
                if (skill.equals("-1")) {
                    break;
                }
                list.add(skill);
            }
            hashMap.put(name, list);
        }


        for (Map.Entry<String, ArrayList> map : hashMap.entrySet()) {

//        System.out.println(map.getKey() + "-" + map.getValue());
            for (int i = 0; i < map.getValue().size(); i++) {
                if (map.getValue().get(i).equals("java")) {
                    System.out.println(map.getKey());
                    break;
                }

            }

        }


    }
}


