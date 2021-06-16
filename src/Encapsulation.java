import java.util.Scanner;

class Person {
    private static char gender;
    private static int age;
    private String name;

    public static char getGender() {
        return gender;
    }

    public static void setGender(char g) {
        gender = g;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int n) {
        age = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class BusTicket {


    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;

    public int getTicketNo() {
        return this.ticketNo;
    }

    public void setTicketNo(int ticketno) {
        this.ticketNo = ticketno;
    }

    public float getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(float totalprice) {
        this.ticketPrice = totalprice;
    }

    public float getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(float totalamount) {
        this.totalAmount = totalamount;
    }

    public void calculateTotal() {

        if (Person.getAge() < 16) {
            setTotalAmount(ticketPrice / 2);
        } else if (Person.getAge() >= 60) {
            setTotalAmount(ticketPrice - (ticketPrice * 25 / 100));
        } else if (Person.getGender() == 'F' || Person.getGender() == 'f') {
            setTotalAmount(ticketPrice - (ticketPrice * 10 / 100));
        } else {
            setTotalAmount(ticketPrice);
        }
    }
}

public class Encapsulation {
    public static BusTicket getTicketDetails() {
        Scanner sc = new Scanner(System.in);
        BusTicket b = new BusTicket();
        System.out.print("Enter the ticket no : ");
        b.setTicketNo(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter the ticket price : ");
        b.setTicketPrice(sc.nextFloat());
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Enter the passenger name : ");
        person.setName(sc.nextLine());
        System.out.print("Enter the gender(M or F/m or f) : ");
        Person.setGender(sc.next().charAt(0));
        System.out.print("Enter the age : ");
        Person.setAge(sc.nextInt());
        sc.nextLine();
        BusTicket b = getTicketDetails();
        b.calculateTotal();
        System.out.println("Ticket no : " + b.getTicketNo());
        System.out.println("passenger Name : " + person.getName());
        System.out.println("Price of a ticket : " + b.getTicketPrice());
        System.out.println("Total Amount : " + b.getTotalAmount());
    }

}


