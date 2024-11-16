package Array.Array_1D;
import java.util.*;
public class Array_4 {
    public static void change(int arr[], int a){
        a = 5;
        for(int i =0 ;i <arr.length;i++){
            arr[i]=arr[i]+1;
        }

    }

    public static void main(String[] args) {
        int[] arr1= new int[5];
        Scanner in= new Scanner(System.in);
        for (int i =0;i<arr1.length;i++){
            System.out.print("Enter the number "+i);
            arr1[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int a =10;
        change(arr1,a);
        System.out.println(a);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }
}
//output
//        Enter the number 0 5
//        Enter the number 1 4
//        Enter the number 2 3
//        Enter the number 3 2
//        Enter the number 4 1
//        [5, 4, 3, 2, 1]
//        10
//        6 5 4 3 2