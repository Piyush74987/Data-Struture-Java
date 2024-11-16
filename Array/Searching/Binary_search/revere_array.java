package Array.Searching.Binary_search;

import java.util.Arrays;

public class revere_array {
    public static void reverse(int arr[]){
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int temp;
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9};
        reverse(number);
        System.out.println(Arrays.toString(number));
    }
}
//output
//        [9, 8, 7, 6, 5, 4, 3, 2, 1]
//        [9, 8, 7, 6, 5, 4, 3, 2, 1]