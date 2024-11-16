package Array.Array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d_pratice {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);

        int[][] arr=new int[3][3];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));

        }



        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }


    }
}
//output:
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]
//        1 2 3
//        4 5 6
//        7 8 9
