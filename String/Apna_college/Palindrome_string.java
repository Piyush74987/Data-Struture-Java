package String.Apna_college;
import java.util.*;
public class Palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the word to check palindrome");
        String word=sc.next();
        System.out.println(palin(word));

    }
    public static boolean palin(String word){
        int n=word.length();
        for(int i=0;i<n/2;i++){
            if(word.charAt(i)!=word.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

}
