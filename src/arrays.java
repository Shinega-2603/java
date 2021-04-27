public class arrays {
    public static void main(String[] args) {
//        int[] arr={3,5,7,8};

//        for(int i:arr)
//        {
//            System.out.println(i);
//        }//or
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//          float[] arr= {2.0f, 8.9f, 7.66f};
//          for(float i:arr){
//              System.out.println(i);
//          }
//        boolean[] arr={true,false,false,true,true};
//        for(boolean i:arr){
//            System.out.println(i);
//        }
//        arrayAscending();
//        arrayDescending();
//        charaAscending();
        charaDescending();

    }

    public static void arrayAscending() {
        int[] arr = {5, 3, 8, 1, 2};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void arrayDescending() {
        int[] arr = {2, 5, 4, 9, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void charaAscending() {
        char[] arr = {'f', 'w', 'a', 'd', 'b'};
        char temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }

    public static void charaDescending() {

        char[] arr = {'l', 'd', 'r', 'i', 'z'};
        char temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

    }
}
