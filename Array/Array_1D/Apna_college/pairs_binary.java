package Array.Array_1D.Apna_college;

public class pairs_binary {
    public static void pairs(int arr[]){
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")"+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int number[] ={1,2,3,4,5,6,7};
        pairs(number);
    }
}
// output
//(1,2) (1,3) (1,4) (1,5) (1,6) (1,7)
//        (2,3) (2,4) (2,5) (2,6) (2,7)
//        (3,4) (3,5) (3,6) (3,7)
//        (4,5) (4,6) (4,7)
//        (5,6) (5,7)
//        (6,7)













//    public static void pairs(int arr[]){
//        int start=0;
//        // int mover=1;
//        int end=arr.length-1;
//        while(start<=end){
//            for(int i=start+1;i<=end;i++){
//                System.out.print(arr[start]+" , "+arr[i]+" ");
//            }
//            System.out.println();
//            start++;
//
//        }
//    }