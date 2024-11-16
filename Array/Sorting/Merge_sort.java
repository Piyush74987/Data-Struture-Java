package Array.Sorting;

//import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int [] arr = {3,1,5,2,5,4,7,4,3,1,10,9,8};
        // System.out.println(mergesort(arr,0,arr.length-1));
        mergesort(arr,0,arr.length-1);
        print(arr);

    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int [] arr , int si ,int ei){
        if(si>=ei){
            return;
        }
        int mid =si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }

    public static void merge(int [] arr, int si,int mid,int ei){
        int [] temp= new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(k=0,i=si;k<=temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
}