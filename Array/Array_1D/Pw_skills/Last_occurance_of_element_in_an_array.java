// pw skills array video 2
// Question --- find the last index of the given number
// apprach --- 1) create a function and put parameter as arr and elements whose last index is we need to find
//             2)  create a variable last index and assign value -1
//             3)  whenever we find the elments put its index as last index
//             4)  if element doesn't exist it will give -1 so we  have assign last index -1






package Array.Array_1D.Pw_skills;

import java.util.Scanner;

public class Last_occurance_of_element_in_an_array {
    public static int Last_ocuurance(int[] arr, int x){
        int last_index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                last_index=i;
            }

        }
        return last_index;
    }

    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=in.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the element in an array");

        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();

        }
        System.out.println("Enter the element whose index we need to find");
        int x=in.nextInt();

        int l=Last_ocuurance(arr,x);
        System.out.println("The last index of element "+x+" is "+ l );
    }
}
//output
//        Enter the size of an array
//        5
//        Enter the element in an array
//        4
//        5
//        7
//        6
//        5
//        Enter the element whose index we need to find
//        5
//        The last index of element 5 is 4