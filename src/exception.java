public class exception {
    public static void main(String[] args) {
//        arr();
        Try();
    }

    public static void arr() {
        int a[] = {1, 3, 5, 2, 4};
        for (int i = 0; i <= a.length; i++)
            System.out.println(a[i]);

    }

    public static void Try() {
        try {
            int divideByZero = 5 / 0;
            System.out.println("Rest of code in try block");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
