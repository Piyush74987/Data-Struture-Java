package Array.Searching.Binary_search;

public class Binary_search_1 {
    public static int bin_search(int  arr[],int a){
        int start=0;
        int end=arr.length-1;
        while(start<=end){

            int mid=(start+end)/2;

            if(arr[mid]==a){
                return mid;
            }
            if(arr[mid]<a){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number []={2,4,6,8,10,12,14};
        //            {0,1,2,3,4, 5, 6}
        int key =10;
        System.out.println( bin_search(number,key));

    }
}
//output =4;