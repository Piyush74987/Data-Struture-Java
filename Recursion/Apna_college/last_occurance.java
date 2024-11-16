package Recursion.Apna_college;

public class last_occurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8,8,8,9,10};
        int target=8;
        int i=arr.length-1;
        System.out.println(last(arr,i,target));

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
// output
// 10
