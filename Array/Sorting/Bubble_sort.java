package Array.Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void bubble(int arr []){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr []={3,4,5,1,2};
        bubble(arr);

    }
}
//output
//        [1, 2, 3, 4, 5]
//  [3,4,5,1,2]=3=4 will compare
// [3,4,5,1,2]=4=5 will compare
// [3,4,5,1,2]=5=1 wil compare
// [3,4,1,5,2]=5=2 will compare
//[3,4,1,2,5]=5=2 will compare
//[3,4,1,2,5]=3=4 will compare
//[3,4,1,2,5]=4=1 will compare
//[3,1,4,2,5]=4=2 will compare
// [3,1,2,4,5]=4=5 will compare
//[3,1,2,4,5]=3=1 will compare
// [1,3,2,4,5]=3=2 will compare
// [1,2,3,4,5]=3=4 will compare
// like this 1 and 2 will compare