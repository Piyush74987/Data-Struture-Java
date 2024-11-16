package Array.Array_1D.Apna_college;

public class max_subarray_prefix {
    public static void max_subarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum= i==0 ? prefix[j]:prefix[j] - prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("maximum sum of a subaaray is  "+maxsum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        max_subarray(number);

    }

}
//output
//        maximum sum of a subaaray is  30