// kunal array video
//Question-- finding maximum value in a particular range of an array
// Approach-- 1) create an array then
//            2) create a function in which we can give parameters as array , starting point,ending point
//            3) give max=start
//            4)  check with other array elements
//            5) return largest element


package Array.Array_1D.Kunal_ku;



public class Maxmium_Array_in_range {
    public static void main(String[] args) {
        int[] arr={12,44,55,66,77,90,100};
        //         [0 ,1 ,2 ,3 ,4 ,5  ,6]

        int maxe=maxrange(arr,2,4);
        System.out.println(maxe);
        int maxei=maxrange(arr,1,6);
        System.out.println(maxei);


    }

    public static int maxrange(int[] arr,int start,int end){
        if(arr.length==0){
            return-1;
        }
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }

}
//output:
//        77
//        100