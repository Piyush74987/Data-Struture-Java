package Array.Searching.Linear_search.kunal;

public class Even_Digit {
    public static void main(String[] args) {
        int arr []={1234,456,789,9876,123456};
        System.out.println(even_number(arr));

    }

    static int even_number(int arr []){
        int count =0;
        for(int i=0;i< arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums){
        int num =0;
        num=digit(nums);
        if(num%2==0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
}
