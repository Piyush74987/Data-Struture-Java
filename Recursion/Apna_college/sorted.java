package Recursion.Apna_college;

public class sorted {
    public static void main(String[] args) {
        int n []={1,2,3,4,5,6,7};
        System.out.println(sort(n,0));

    }
    public static boolean sort(int [] arr, int n){
        if(n==arr.length-1){
            return true;
        }
        if(arr[n]>arr[n+1]){
            return false;
        }
        return sort(arr,n+1);
    }
}
