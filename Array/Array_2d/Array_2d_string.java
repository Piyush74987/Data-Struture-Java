package Array.Array_2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2d_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[][] arr=new String[2][3];

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.next();
            }
        }

        for(int rows=0;rows<arr.length;rows++){
            System.out.println(Arrays.toString(arr[rows]));
        }


    }


}

//output
//    piyush
//    messi
//    pedri
//    subam
//    kunal
//    parth
//    [piyush, messi, pedri]
//     [subam, kunal, parth]
