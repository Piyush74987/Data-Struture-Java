// pw skills array video2
// questions-- find number of ocuurance of element in an array
// apprach --   1) create a function to count occurance
//                2) take a input to find which element occurance we have to choose
//                3) make a variable count and campare with element in the array
//                4) and increase cout++ whenwver we get the number in an array
package Array.Array_1D.Pw_skills;

import java.util.Scanner;

public class Occurane_of_element_in_array {
    public static int Occurance(int[] arr,int c){
        if(arr.length==0){
            System.out.println("Array is empty");
        }

        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size  of an array");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the element of array");

        for (int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }

        System.out.println("enter the elment whose ocuurance u want");
        int c= in.nextInt();

        int o=Occurance(a,c);
        System.out.println("the number of occurance " + c +" is  "+ o);


    }
}
//output
// Enter the element of array
//1
//2
//3
//4
//4
//4
//4
//4
//enter the elment whose ocuurance u want
//4
//the number of occurance 4 is  5
