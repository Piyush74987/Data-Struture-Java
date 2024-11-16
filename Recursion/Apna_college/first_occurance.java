package Recursion.Apna_college;

public class first_occurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8,8,8,9,10};
        int target=8;
        System.out.println(first(arr,0,target));

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
}
//output
//7