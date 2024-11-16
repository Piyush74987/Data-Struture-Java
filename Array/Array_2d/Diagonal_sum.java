package Array.Array_2d;

import java.util.Arrays;

public class Diagonal_sum {
    public static void diagonal_sum(int arr[][]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][i];// when will it be in diagonal 0,0 1,1 ,22,33
            if(i!=arr.length-1-i){
                sum=sum+arr[i][arr.length-i-1];

            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,6,7},{9,4,8}};
        for(int i =0; i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        diagonal_sum(arr);



    }
}
//output
//        [1, 2, 3]
//        [5, 6, 7]
//        [9, 4, 8]
//        27
