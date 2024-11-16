//problem Statement
//
//        You are given a function,
//
//        Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);
//
//        The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments .
//        Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’
//        in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.
//
//        Assumption: String Contains only lower-case alphabetical letters.
//
//        Note:
//
//        Return null if string is null.
//        If both characters are not present in string or both of them are same , then return the string unchanged.
//        Example:
//
//        Input:
//        Str: apples
//        ch1:a
//        ch2:p
//        Output:
//        paales
//        Explanation:
//
//        ‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.
package interview_coding_questions.Accenture;
import java.util.*;

public class String_change {
    public static String change(String str,int n,char c1,char c2){
        if(str==null){
            return null;
        }
        if(c1==c2){
            return str;
        }
        String res="";
        for(int i =0;i<n;i++){
            if(str.charAt(i)==c1){
                res=res+c2;
            }
            else if(str.charAt(i)==c2){
                res=res+c1;
            }
            else{
                res=res+str.charAt(i);
            }

        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        System.out.println(change(str,n,c1,c2));

    }
}
