package Recursion.Apna_college;

import java.util.Arrays;

public class first_last_occurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8,8,8,9,10};
        int target=8;
        int i=arr.length-1;
        int [] arr1={first(arr,0,target),last(arr,i,target)};
        System.out.println(Arrays.toString(arr1));

    }
    public static int first(int arr [],int i, int target){
        if(i==arr.length-1) {
            return -1;
        }
        if(target==arr[i]){
            return i;
        }
        return first(arr,i+1,target);
    }
    public static int last(int arr [], int i, int target){
        if(i==0) {
            return -1;
        }
        if(target==arr[i]){
            return i;
        }
        return last(arr,i-1,target);
    }
}
//output
//        [7, 10]
