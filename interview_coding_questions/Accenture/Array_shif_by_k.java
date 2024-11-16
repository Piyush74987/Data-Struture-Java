package interview_coding_questions.Accenture;
import java.util.*;
public class Array_shif_by_k {
    public static void Array_shift(int arr[], int k){
        int n =arr.length;
        int temp;
        for(int j=0;j<=k;j++){
            for(int i=0;i<n-1;i++){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int k=3;
        Array_shift(arr,k);
    }
}
