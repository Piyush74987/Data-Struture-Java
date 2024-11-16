package Array.Array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2_cio {
    public static void main(String[] args) {
        System.out.println("2D Array creating inseration and outing");
        Scanner in = new Scanner(System.in);
        int[][] arr=new int[4][3];

        System.out.println("inseration in 2d array");

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length; col++){
                arr[row][col]=in.nextInt();
            }
        }

        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }
        System.out.println(Arrays.toString(arr));


        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));// here it will be row wise
        }


    }
}

////output
//2D Array creating inseration and outing
//        inseration in 2d array
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        1
//        2
//        3
//        1 2 3
//        4 5 6
//        7 8 9
//        1 2 3
//        [[I@433c675d, [I@3f91beef, [I@1a6c5a9e, [I@37bba400]
//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]
//        [1, 2, 3]
