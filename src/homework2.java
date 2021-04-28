public class homework2 {
    public static void main(String[] args) {
//       pattern();
//       odd();
        calender();
    }

    public static void pattern() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + "." + j);
            }
        }
    }

    public static void odd() {
        String a = "shinega";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                System.out.println(a.charAt(i));
            }
        }
    }

    public static void calender() {
        int year = 2020;

        for (int month = 1; month <= 12; month++) {
            for (int date = 1; date <= 31; date++) {
                if (month % 2 != 0 && month != 7 && month != 9 && month != 11) {
                    System.out.println(year + "-" + month + "-" + date);
                }
            }
        }
        for (int month = 7; month <= 12; month++) {
            for (int date = 1; date <= 31; date++) {
                if (month == 7) {
                    System.out.println(year + "-" + month + "-" + date);
                } else if (month % 2 == 0) {
                    System.out.println(year + "-" + month + "-" + date);
                }
            }
        }
        for (int month = 1; month <= 7; month++) {
            for (int date = 1; date <= 30; date++) {
                if (month % 2 == 0 && month != 2) {
                    if (month == 9 && month == 11) {
                        System.out.println(year + "-" + month + "-" + date);
                    }
                }
            }
        }

        int month = 2;
        if (year % 4 == 0) {
            for (int date = 1; date <= 29; date++) {
                System.out.println(year + "-" + month + "-" + date);
            }
        } else {
            for (int date = 1; date <= 28; date++) {
                System.out.println(year + "-" + month + "-" + date);
            }
        }

    }


}

