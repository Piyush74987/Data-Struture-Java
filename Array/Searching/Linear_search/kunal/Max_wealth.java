package Array.Searching.Linear_search.kunal;
// leetcode questions no 1672
// https://leetcode.com/problems/richest-customer-wealth/

public class Max_wealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3,4,5}
        } ;
        System.out.println(maximumWealth(accounts));
    }


    public static  int maximumWealth(int[][] accounts) {
        int ans =Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
