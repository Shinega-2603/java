public class mirror {
    public static void main(String[] args) {
        String s = "abfr";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int n = (122 - a) + 97;
            char m = (char) n;
            System.out.print(m);

        }
    }
}
