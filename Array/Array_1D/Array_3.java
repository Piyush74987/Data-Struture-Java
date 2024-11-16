package Array.Array_1D;

import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        System.out.println("pratice");
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[4];

        for(int i =0;i<arr.length;i++){
            arr[i]=sc.next();
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        System.out.println(arr);

    }

    public static class Arrays_pratice {
    }
}
//output
//    pratice
//    piyush
//    messi
//    pedri
//    gavi
//    piyush messi pedri gavi
//    piyush messi pedri gavi
//    [piyush, messi, pedri, gavi]
//    [Ljava.lang.String;@7c3df479