public class matrix {
    public static void main(String[] args) {
        transposes();
    }

    public static void transposes() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int m = a.length;
        int n = a[0].length;


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }

    }
}
