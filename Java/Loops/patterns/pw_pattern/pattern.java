package Java.Loops.patterns.pw_pattern;

public class pattern {
    public static void main(String args[]) {
        pattern4(6);


    }


    public static void pattern1(int h, int w) {
        for (int row = 1; row <= h; row++) {
            for (int col = 1; col <= w; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
//        * * * * * *
//        * * * * * *
//        * * * * * *
    }


    public static void pattern2(int h, int w) {
        for (int row = 1; row <= h; row++) {
            for (int col = 1; col <= w; col++) {
                if((row==1)||(row==h)||(col==1)||(col==w)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
//        * * * * * *
//        *         *
//        *         *
//        * * * * * *
    }
    public static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row == 1) || (row == n) || (col == 1) || (col == n)) {
                    System.out.print(col+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
//        1 2 3 4 5 6
//        1         6
//        1         6
//        1         6
//        1         6
//        1 2 3 4 5 6
    }

    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<i;k++){
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
//        1 2 3 4 5 6
//        2 3 4 5 6 1
//        3 4 5 6 1 2
//        4 5 6 1 2 3
//        5 6 1 2 3 4
//        6 1 2 3 4 5
    }



}