

import java.util.Scanner;

public class HowToUseFunction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side");
        int side = sc.nextInt();
        areaSquare(side);


        System.out.println("enter length");
        int len = sc.nextInt();
        System.out.println("enter breath");
        int bre = sc.nextInt();
        areaRectangle(len, bre);

        System.out.println("enter the base");
        int base = sc.nextInt();
        System.out.println("enter the height");
        int height = sc.nextInt();
        areaTriangle(base, height);

        System.out.println("enter the radius");
        int radius = sc.nextInt();
        areaCircle(radius);


        areaSquare(5);
        areaRectangle(4, 8);
        areaTriangle(8, 5);
        areaCircle(4);
        areaCircle(9);
    }

    public static void areaSquare(int side) {
        int area = side * side;
        System.out.println("area " + area);
    }

    public static void areaRectangle(int len, int bre) {
        int arearec = len * bre;
        System.out.println("area of rectangle: " + arearec);
    }

    public static void areaTriangle(int base, int h) {
        float areatri = 0.5f * base * h;
        System.out.println("area of triangle: " + areatri);
    }

    public static void areaCircle(int radius) {
        double areacir = 3.14 * radius * radius;
        System.out.println("area of circle: " + areacir);
    }

}
