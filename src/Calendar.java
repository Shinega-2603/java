public class Calendar {
    public static void main(String[] args) {
        cal();
    }

    public static void cal() {
        int year = 2020;
        for (int month = 1; month <= 12; month++) {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (month < 10) {
                        for (int date = 1; date <= 31; date++) {
                            if (date < 10) {
                                System.out.println("0" + date + "-" + "0" + month + "-" + year);
                            } else {
                                System.out.println(date + "-" + "0" + month + "-" + year);
                            }
                        }
                    } else {
                        for (int date = 1; date <= 31; date++) {
                            if (date < 10) {
                                System.out.println("0" + date + "-" + month + "-" + year);
                            } else {
                                System.out.println(date + "-" + month + "-" + year);
                            }
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (month < 10) {
                        for (int date = 1; date <= 30; date++) {
                            if (date < 10) {
                                System.out.println("0" + date + "-" + "0" + month + "-" + year);
                            } else {
                                System.out.println(date + "-" + "0" + month + "-" + year);
                            }
                        }
                    } else {
                        for (int date = 1; date <= 31; date++) {
                            if (date < 10) {
                                System.out.println("0" + date + "-" + month + "-" + year);
                            } else {
                                System.out.println(date + "-" + month + "-" + year);
                            }
                        }
                    }
                    break;
                case 2:
                    if (year % 4 == 0) {
                        if (month < 10) {
                            for (int date = 1; date <= 29; date++) {
                                if (date < 10) {
                                    System.out.println("0" + date + "-" + "0" + month + "-" + year);
                                } else {
                                    System.out.println(date + "-" + "0" + month + "-" + year);
                                }
                            }

                        }
                    } else {
                        if (month < 10) {
                            for (int date = 1; date <= 28; date++) {
                                if (date < 10) {
                                    System.out.println("0" + date + "-" + "0" + month + "-" + year);
                                } else {
                                    System.out.println(date + "-" + month + "-" + year);
                                }
                            }
                        }
                    }
            }
        }
    }
}
