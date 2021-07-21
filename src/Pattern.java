public class Pattern {
    public static void main(String[] args) {

        int n = 5;

//        for (int i = 1; i <=n; i++) {
//            for (int j =1; j <= i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println("");
//        }
//    }
//        for (int i = n; i>=1; i--) {
//            for (int j = 1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <=n; i++) {
//            for (int j = 2*(n-i); j>=1; j--) {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
        int m = 3;
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++) {
//                if ((i == 1 || i == n || j == 1 || j == n)||(i==m)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println(" ");
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++) {
//                if (i == 1 || i == n || j == 1 || j == n||i==j||j==(n-i+1)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=2*(n-i);j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++) {
//                if (i == n || j == 1 || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=i;j<=n;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i;j++){
//                if(i==n||j==1||j==2*i-1){
//                    System.out.print(i);
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//        for(int i=n;i>=1;i--) {
//            for (int j = i; j <= n; j++) {
//                if (i == 1 || j == n || j == i) {
//                    System.out.print(j );
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j%2!=0){
//                    System.out.print(j);
//                }
//            }
//        }
//        int l=0;
//        for(int i=1;i<=n;i++){
//            for(int j=2*(n-i);j>=1;j--){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=i;j++) {
//                System.out.print(j * l+" ");
//            }
//            System.out.println();
//            l=l+2;
//        }
//        int k=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++,k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//        int k = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                if (i == n || j == 1 || j == i) {
//                    System.out.print(j * k + " ");
//                } else {
//                    System.out.print("    ");
//                }
//            }
//            System.out.println();
//            k = k + 2;
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
        int k = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * k + " ");
            }
            System.out.println();
            k = k + 2;
        }
    }
}


