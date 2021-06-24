
import java.util.HashMap;

public class FetchBalance {

    private HashMap<String, Float> userAccountBalanceMap = new HashMap<>();

    public void setUserAccountBalanceMap(String userId, float userBalance) {

        userAccountBalanceMap.put(userId, userBalance);
    }

    public float getUserAccountBalanceMap(String userId) {

        return userAccountBalanceMap.get(userId);
    }

    public boolean findUser(String userId) {

        if (userAccountBalanceMap.containsKey(userId)) {
            return true;
        }
        return false;
    }
}

