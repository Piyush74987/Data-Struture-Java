package Array.Searching.Linear_search;

public class linear_search {

    public static int linear(int arr[],int a){
        int index=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==a){
                index=i;
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number ={1,2,3,4,5,6,7,8,9,10};
        int key = 6;
        System.out.println(linear(number,key));

    }
}
//output = 5;