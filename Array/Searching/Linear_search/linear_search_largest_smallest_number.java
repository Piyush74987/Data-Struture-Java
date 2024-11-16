package Array.Searching.Linear_search;

public class linear_search_largest_smallest_number {
    public static void lar_sma(int arr[]){
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest number in an array is "+largest);
        System.out.println("Smallest number in an array is "+smallest);
    }
    public static void main(String[] args) {
        int number[]={1,2,33,44,55,77,66,88,999};
        lar_sma(number);

    }

}
//output
//
//        Largest number in an array is 999
//        Smallest number in an array is 1