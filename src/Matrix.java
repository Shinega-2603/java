public class Matrix {
    public static void main(String[] args) {
//        transposes();
//        addMatrix();
        colWise();
//        diaMatrix();
//        subMatrix();

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

    public static void addMatrix() {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};
        int[][] b = {{2, 1, 2}, {1, 2, 1}, {2, 1, 2}};
        int[][] c = new int[a.length][a[0].length];


        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void colWise() {
        int[][] a = {{1, 2, 3}, {2, 1, 2}, {3, 4, 6}, {4, 2, 6}, {5, 8, 6}};
        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < col; i++) {
            int sumcol = 0;
            for (int j = 0; j < row; j++) {
                sumcol = sumcol + a[j][i];

            }
            System.out.println(sumcol);
        }
    }

    public static void diaMatrix() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row = a.length;
        int col = a[0].length;
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j == i) {
                    diagonal1 = diagonal1 + a[i][j];
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == row - j - 1) {
                    diagonal2 = diagonal2 + a[i][j];
                }
            }
        }

        int diff = diagonal1 - diagonal2;
        System.out.println(diff);
    }

    public static void subMatrix() {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {7, 8, 9}};

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}

