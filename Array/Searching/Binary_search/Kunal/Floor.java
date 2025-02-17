package Array.Searching.Binary_search.Kunal;
// Floor  means finding number which is smaller than or equal to  target
public class Floor {
    public static void main(String[] args) {
        int[] sort={1,3,5,7,9,11,13,15,17,19};
        //         {0,1,2,3,4, 5, 6, 7, 8, 9}
        int target=0;
        int ans= floor(sort,target);
        System.out.println(ans);


    }

    public static int floor(int arr [], int target){
        int start=0;
        int end=arr.length-1;

        if(target<arr[start]){
            return -1;
        }

        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}

