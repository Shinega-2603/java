public class Array {


    public static void main(String[] args) {

        int arr1[] = {2, -7, 9, 22, -3};

        int arr2[] = arr1;

        arr1 = new int[]{3, 17, -6, 4, -56};

        System.out.println((arr2[3] % arr1[4]) - arr1[2] * arr2[3]);

    }

}

