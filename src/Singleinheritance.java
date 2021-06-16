import java.util.Scanner;

class Lorry {

    String name = "PMT LORRY SERVICE";

    public String typeoftruck() {
        System.out.println("default");
        return null;
    }

    public boolean tyrecondition() {
        System.out.println("Good/Bad");
        return false;
    }

    public float diesellitres() {
        System.out.println("tank capacity");
        return 0;
    }

    public String startPoint() {
        System.out.println("default");

        return null;
    }

    public String endPoint() {
        System.out.println("default");

        return null;
    }


}


class LPGTruck extends Lorry {

    Scanner sc = new Scanner(System.in);

    public LPGTruck(String name) {
        this.name = name;

    }

//    public String name(String name) {
//        this.name = name;
//
//        return name;
//    }

    @Override
    public String typeoftruck() {
        String n = "Gas Tanker Lorry";
        return n;
    }

    @Override
    public boolean tyrecondition() {
        System.out.print("Enter the tyre working condition : ");
        String con = sc.nextLine();
        if (con.equals("good")) {
            return true;
        }
        return false;
    }

    @Override
    public float diesellitres() {
        System.out.print("Enter the litres present in diesel tanks : ");
        float l = sc.nextFloat();
        return l;

    }

    @Override
    public String startPoint() {
        System.out.print("From where : ");
        String s = sc.next();
        sc.nextLine();
        return s;
    }

    @Override
    public String endPoint() {
        System.out.print("Destination : ");
        String d = sc.next();
        sc.nextLine();
        return d;
    }

}


public class Singleinheritance {
    public static void main(String[] args) {
        LPGTruck L = new LPGTruck("PMT LORRY SERVICE");
        System.out.println(L.name);
        System.out.println(L.typeoftruck());
        System.out.println(L.tyrecondition());
        System.out.println(L.diesellitres());
        System.out.println(L.startPoint());
        System.out.println(L.endPoint());
    }
}
