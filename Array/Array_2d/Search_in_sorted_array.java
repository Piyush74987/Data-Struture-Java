package Array.Array_2d;

import java.util.Arrays;

public class Search_in_sorted_array {
    public static boolean search(int arr[][],int key){
        int row=0;
        int col=0;
        while(row<arr.length && col<arr[0].length){
            if(arr[row][col]==key){
                System.out.println(row+" , "+col);
                return true;
            }else if(arr[row][col]<key){
                col++;
                row++;
            }else{
                row--;
                col--;
            }

        }
        System.out.println("number not found");
        return false;
    }
    public static void main(String[] args) {
        int arr [][]={{1,2,3},{4,5,6},{7,8,9}};
        int key =3;
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(search(arr,key));

    }
}
// output
//        [1, 2, 3]
//        [4, 5, 6]
//        [7, 8, 9]
//        0 , 2
//        true