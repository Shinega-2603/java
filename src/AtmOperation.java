import java.util.HashMap;
import java.util.Scanner;

class AtmOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> bankDetalis = new HashMap<>();
        bankDetalis.put("papu", "6622");
        bankDetalis.put("anni", "1212");
        bankDetalis.put("shinega", "1222");

        System.out.println("Enter userName");
        String userName = sc.nextLine();

        System.out.println("Enter Pin");
        String pin = sc.nextLine();
        int n = Integer.parseInt(pin);


        if (bankDetalis.containsKey(userName)) {
            if (bankDetalis.get(userName).equals(pin)) {
                int balance = balan(n);
                boolean c = true;
                while (c) {
                    System.out.println("enter the option : 1.Withdraw, 2.Deposite, 3.Balance, 4.Exit ");
                    int option = sc.nextInt();
//                    int balance = balan(n);
                    switch (option) {
                        case 1:
                            System.out.print("Enter money to withdraw:");
                            int withdraw = sc.nextInt();

                            if (balance >= withdraw) {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                System.out.println("current balance : " + balance);
                            } else {
                                System.out.println("Insufficient Balance");
                                System.out.println("your current balance is : " + balance);
                            }
                            break;
                        case 2:
                            System.out.print("Enter money to be deposited:");
                            int deposit = sc.nextInt();
                            balance = balance + deposit;
                            System.out.println("Your Money has been successfully deposited");
                            System.out.println("current balance : " + balance);
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                        case 4:
                            c = false;
                            System.out.println("Exit");
                            break;
                    }
                }
            } else {
                System.out.println("Wrong Pin");
            }
        } else {
            System.out.println("No User Found");
        }
    }

    public static int balan(int n) {
        int bal = 0;
        while (n > 0) {
            int sum = n % 10;

            bal = sum + bal;
            n = n / 10;

        }
        return bal * 100;
    }

}






