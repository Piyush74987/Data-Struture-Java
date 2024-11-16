package Array.Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args){
            System.out.println("how to create an array");
            Scanner input =new Scanner(System.in);
            int[] arr=new int[5];

            // inserting in an array
            for(int i =0;i<arr.length;i++){
                arr[i]=input.nextInt();
            }
            System.out.println("------------------------------------------");

            System.out.println("output of an array using simple for loop");

            for(int i =0;i<arr.length;i++) {
                System.out.println(arr[i] + " ");
            }

            System.out.println("-----------------------------------------");
            System.out.println("advanced for loop used for output of array ");
            for (int j : arr) {
                System.out.println(j + " ");
            }
            System.out.println("--------------------------------------------");
            // array output 3 way
            System.out.println(Arrays.toString(arr));
        }

    public static class sub_array {
        public static void subarray(int arr[]){
            int a= 0;
            for (int i=0;i<arr.length;i++){
                int start=i;
                for(int j=i;j<arr.length;j++){
                    int end= j;
                    for(int k=start;k<=end;k++){
                        System.out.print(arr[k]+" ");
                    }
                    a++;
                    System.out.println(" ");
                }
                System.out.println(" ");

            }
            System.out.println("total number of subarray=" + a);
        }
        public static void main(String[] args) {

            int [] number ={2,4,6,8,10};
            //int [] number ={15,66,66,77,44,555};
            subarray(number);
        }
    }
}

//output
//        how to create an array
//        5
//        3
//        4
//        5
//        6
//        ------------------------------------------
//        output of an array using simple for loop
//        5
//        3
//        4
//        5
//        6
//        -----------------------------------------
//        advanced for loop used for output of array
//        5
//        3
//        4
//        5
//        6
//        --------------------------------------------
//        [5, 3, 4, 5, 6]
//
