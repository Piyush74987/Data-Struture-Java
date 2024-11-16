package Array.Array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d_colmissing {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        int [] arr1={1,2,3,4,5};
        System.out.println(arr1.length);


        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
                System.out.println("="+arr.length);
                System.out.println("----"+arr[row].length);
            }
            System.out.println();
        }
    }
}
//output
//        1 2 3 4
//        5 6
//        7 8 9


//output
//5
//        1 =3
//        ----4
//        2 =3
//        ----4
//        3 =3
//        ----4
//        4 =3
//        ----4
//
//        5 =3
//        ----2
//        6 =3
//        ----2
//
//        7 =3
//        ----3
//        8 =3
//        ----3
//        9 =3
//        ----3