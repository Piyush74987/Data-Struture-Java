package Backtracking;

public class Find_permutation {
    public static void main(String[] args) {
        String str="abc";
        permutation(str," ");
    }

    public static void permutation(String str ,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr =str.charAt(i);
            String str1=str.substring(0,i)+str.substring(i+1);
            permutation(str1,ans+curr);
        }
    }

}
//output
//abc
//acb
//bac
// bca
// cab
// cba

