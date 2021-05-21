public class uniqueSub {
    public static void main(String[] args) {
        String str = "masai";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                subString(str, i, j);
            }
        }
    }

    public static void subString(String str, int i, int j) {
        String temp = "";
        boolean flag = false;
        for (int k = i; k <= j; k++) {
            if (temp.contains("" + str.charAt(k))) {
                flag = true;
                break;
            }
            temp += str.charAt(k);
        }
        if (!flag) System.out.println(temp);
    }
}
