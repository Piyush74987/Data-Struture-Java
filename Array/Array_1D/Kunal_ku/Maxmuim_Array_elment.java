// kunal array video
//Question-- finding maximum value in  an array
// Approach-- 1) create an array then
//            2) create a function in which we can give parameters as array
//            3) give max=arr[0]
//            4)  check with other array elements
//            5) return largest element

package Array.Array_1D.Kunal_ku;

import java.util.Scanner;

public class Maxmuim_Array_elment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int maximum=maxvalue(arr);
        System.out.println(maximum);

    }
        public static int maxvalue(int[] arr) {

        if (arr.length==0) {
            return -1;
        }

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}

//output16
//        13
//        22
//        55
//        88
//        88
