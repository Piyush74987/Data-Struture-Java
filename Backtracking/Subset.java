package Backtracking;

public class Subset {
    public static void main(String[] args) {
        String str="abcd";
        sub(str,0," ");

    }

    public static void sub(String str,int i,String ans){
       if(str.length()==i) {

           if (str.length() == 0) {
               System.out.println("Null");
           } else {
               System.out.println(ans);
           }
           return;
       }

        sub(str,i+1,ans);
        sub(str,i+1,ans+str.charAt(i));

    }
}
