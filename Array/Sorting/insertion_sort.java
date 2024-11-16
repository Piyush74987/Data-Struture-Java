package Array.Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr []={3,4,5,1,2};
        insertion(arr);
    }
}
//output
//[1,2,3,4,5]
