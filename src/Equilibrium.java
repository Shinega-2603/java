public class Equilibrium {
    public static void main(String[] args) {
        equilibrium();
    }

    public static void equilibrium() {
        int arr[] = {3, 3, 5, 5, 1};


        int leftsum, rightsum;


        for (int i = 0; i < arr.length; ++i) {

            leftsum = 0;
            for (int j = 0; j < i; j++)
                leftsum += arr[j];
            rightsum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightsum += arr[j];


            if (leftsum == rightsum) {
                System.out.println(i);
            }

        }


    }
}

