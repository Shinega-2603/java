import java.util.Scanner;


class AnnaAtmOperation extends UserUIDandPIN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        initializeDetails();

        FetchBalance fetchBalance = new FetchBalance();

        boolean loop = true;

        while (loop) {

            System.out.println("Enter UID");
            String userName = sc.nextLine();

            if (findUser(userName)) {

                System.out.println("Enter PIN");
                String userPin = sc.nextLine();

                if (checkPassword(userName, userPin)) {

                    String userId = userName + userPin;

                    if (!fetchBalance.findUser(userId)) {
                        fetchBalance.setUserAccountBalanceMap(userId, generateBalanceFromPIN(userPin));
                    }
                    boolean operations = true;
                    while (operations) {

                        System.out.println("1.Balance 2.WithDraw 3.Deposit 4.Exit");


                        int op = sc.nextInt();

                        switch (op) {

                            case 1:
                                System.out.println(fetchBalance.getUserAccountBalanceMap(userId));
                                break;
                            case 2:

                                System.out.println("Enter amount to Withdraw");

                                int withDrawal = sc.nextInt();
                                float avl_bal = fetchBalance.getUserAccountBalanceMap(userId);

                                if (avl_bal >= withDrawal) {
                                    avl_bal -= withDrawal;
                                    System.out.println("Collect your Money");
                                    fetchBalance.setUserAccountBalanceMap(userId, avl_bal);

                                    System.out.println("Type 'Yes' to print the Balance");

                                    if (sc.next().equals("Yes")) {
                                        System.out.println(fetchBalance.getUserAccountBalanceMap(userId));
                                    }

                                }
                                break;
                            case 3:

                                System.out.println("Enter amount to Deposit");

                                int deposit = sc.nextInt();
                                fetchBalance.setUserAccountBalanceMap(userId, fetchBalance.getUserAccountBalanceMap(userId) + deposit);

                                System.out.println("Successfully added to your account");

                                System.out.println("Type 'Yes' to print the Balance");

                                if (sc.next().equals("Yes")) {
                                    System.out.println(fetchBalance.getUserAccountBalanceMap(userId));
                                }

                                break;

                            case 4:
                                operations = false;
                                break;

                        }
                        sc.nextLine();

                    }

                } else {
                    System.out.println("Wrong Password");
                }
            } else {
                System.out.println("Wrong User Found");
            }
        }

    }


    private static float generateBalanceFromPIN(String pin) {

        float bal = 0;
        for (int i = 0; i < pin.length(); i++) {
            bal += Integer.parseInt("" + pin.charAt(i));
        }

        return bal * 100;
    }
}