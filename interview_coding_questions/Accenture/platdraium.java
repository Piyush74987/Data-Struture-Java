package interview_coding_questions.Accenture;

public class platdraium {

    public static void main(String[] args) {
        String str="c1 O$d@eeD o1c";
        System.out.println(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str) {
        String str1=remove(str);
        System.out.println(str1);
        str=str1.toLowerCase();
        int n=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }
        }
        return true;// WRITE YOUR CODE HERE
    }
    public static String remove(String str){
        StringBuilder str1 =new StringBuilder("");
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                str1.append(str.charAt(i));
            }
            if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
}
