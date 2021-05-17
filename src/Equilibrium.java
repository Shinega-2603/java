public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = {3, 3, 5, 5, 1};
        boolean flag = true;
        int rightsum;
        int leftsum = 0;

        for (int i = 0; i < arr.length; ++i) {

            rightsum = 0;
            for (int j = i + 1; j < arr.length; j++)
                rightsum += arr[j];

            if (leftsum == rightsum) {
                flag = false;
                System.out.println(i + 1);
                break;
            }
            leftsum = leftsum + arr[i];

        }
        if (flag) {
            System.out.println(-1);
        }


    }
}
