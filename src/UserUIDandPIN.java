import java.util.HashMap;

public class UserUIDandPIN {

    private static HashMap<String, String> userDetailsMap = new HashMap<>();

    //    public void setUserDetailsMap(String userName, String userPin ) {
//
//        userDetailsMap.put(userName, userPin);
//    }

    public static boolean findUser(String userName) {

        if (userDetailsMap.containsKey(userName)) {
            return true;
        }

        return false;
    }

    public static boolean checkPassword(String userName, String userPin) {

        if (userDetailsMap.get(userName).equals(userPin)) {
            return true;
        }
        return false;
    }

    public static void initializeDetails() {

        userDetailsMap.put("Mukesh", "1234");
        userDetailsMap.put("Shobana", "2345");
        userDetailsMap.put("Sangavi", "3456");
        userDetailsMap.put("Rithika", "4567");

    }
}

