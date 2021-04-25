

public class typecasting {
    public static void main(String[] args) {
        String b = "12345g";
        int a = Integer.parseInt(b);
        System.out.println(a);

        int i = 200;
        long l = i;
        System.out.println(l);

        double d = 200.06d;
        int number = (int) d;
        System.out.println(number);

        short c = (short) 2147483647;
        System.out.println(c);

    }
}
