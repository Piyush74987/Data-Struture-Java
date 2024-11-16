package Array.Array_1D.Apna_college;

public class max_subarray_kadane_algo {

    public static void max_number(int arr[]){
        int cm=0; // current max
        int mm = Integer.MIN_VALUE; // maxium max
        int n =arr.length;
        for(int i=0 ;i<n;i++){
            cm=cm+arr[i];
            if(cm<0){
                cm=0;
            }
            mm=Math.max(cm,mm);
        }
        System.out.println(mm);
    }
    public static void main(String[] args) {
        //int number[]={2,4,6,8,10};
        int number[]={-3,-5,-7,3,5,2};
        max_number(number);
    }
}
//output = 30;