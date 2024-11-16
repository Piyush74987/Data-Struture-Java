package Array.Array_2d;
import java.util.*;
public class Search_number {
    public static void search(int arr [][],int key){
        int num=0;
        for (int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==key){
                    num++;
                }
            }
        }
        if(num>0){
            System.out.println("NUmber is prsent in an array");
            System.out.println("number was"+num+"time prsent in 2d array");
        }else{
            System.out.println("NUmber is was not prsent in an array");
        }
    }
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner in = new Scanner (System.in);
        int key =5;
        for (int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for (int i =0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        search(arr,key);
    }
}
//output
//        5
//        5
//        4
//        3
//        2
//        1
//        8
//        7
//        5
//        [5, 5, 4]
//        [3, 2, 1]
//        [8, 7, 5]
//        NUmber is prsent in an array
//        number was3time prsent in 2d array