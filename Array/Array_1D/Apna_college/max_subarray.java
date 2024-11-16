package Array.Array_1D.Apna_college;
import java.util.*;



public class max_subarray {
    public static void max_subarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currsum=currsum+arr[k];
                }
                System.out.println(" ");
                System.out.println("-------- down side is sum of above subarray");
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maximum sum of a subaaray is  "+maxsum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        max_subarray(number);

    }
}
//output
//        2
//        -------- down side is sum of above subarray
//        2
//        2 4
//        -------- down side is sum of above subarray
//        6
//        2 4 6
//        -------- down side is sum of above subarray
//        12
//        2 4 6 8
//        -------- down side is sum of above subarray
//        20
//        2 4 6 8 10
//        -------- down side is sum of above subarray
//        30
//        4
//        -------- down side is sum of above subarray
//        4
//        4 6
//        -------- down side is sum of above subarray
//        10
//        4 6 8
//        -------- down side is sum of above subarray
//        18
//        4 6 8 10
//        -------- down side is sum of above subarray
//        28
//        6
//        -------- down side is sum of above subarray
//        6
//        6 8
//        -------- down side is sum of above subarray
//        14
//        6 8 10
//        -------- down side is sum of above subarray
//        24
//        8
//        -------- down side is sum of above subarray
//        8
//        8 10
//        -------- down side is sum of above subarray
//        18
//        10
//        -------- down side is sum of above subarray
//        10
//        maximum sum of a subaaray is  30
