package interview_coding_questions.Neet_code;

public class Array_duplicates {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        System.out.println(hasDuplicate(arr));


    }
    static public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int s=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(s==nums[j]){
                    return true;
                }
            }
        }
        return false;

    }
}
