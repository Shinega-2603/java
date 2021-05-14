import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Mukesh", 984);
        hashMap.put("sho", 789);
        hashMap.put("rit", 786);
        hashMap.put("san", 345);
        hashMap.put("shi", 546);
        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + "-" + map.getValue());
        }
    }
}
