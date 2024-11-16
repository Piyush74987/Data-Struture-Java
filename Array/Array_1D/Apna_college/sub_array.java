package Array.Array_1D.Apna_college;

public class sub_array {
    public static void subarray(int arr[]){
        int a= 0;
        for (int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end= j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                a++;
                System.out.println(" ");
            }
            System.out.println(" ");

        }
        System.out.println("total number of subarray=" + a);
    }
    public static void main(String[] args) {

        int [] number ={2,4,6,8,10};
        //int [] number ={15,66,66,77,44,555};
        subarray(number);
    }
}
//output
//        2
//        2 4
//        2 4 6
//        2 4 6 8
//        2 4 6 8 10
//
//        4
//        4 6
//        4 6 8
//        4 6 8 10
//
//        6
//        6 8
//        6 8 10
//
//        8
//        8 10
//
//        10
//
//        total number of subarray=15
