public class Rectangle {
    static int length = 2;
    int breath = 2;

    public static void area() {
        Rectangle c = new Rectangle();
        int b = c.breath;
        int a = length * b;
        int p = 2 * (length + b);
        System.out.println("Area of rectngle is " + a);
        System.out.println("Peimeter of rectngle is " + p);
    }

}

