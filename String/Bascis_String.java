package String;
import java.util.*;
public class Bascis_String {
    public static void main(String[] args) {
        char ch='a';
        String str="abcd123";
        String str1=new String("abcd123@%");//  a abcd123 abcd123@%
        System.out.println(ch+" "+str+" "+str1);
        Scanner in =new Scanner(System.in);
        System.out.print("enter the line");// enter the line messi is best player
        String  name = in.nextLine(); // next take only one word and next line takes a line
        System.out.println(name);//messi is best player
        String firstname="pedri";
        String lastname="Gonzales";
        String full_name=firstname+" "+lastname;// it is called concation
        System.out.println(full_name);//pedri Gonzales

//        output
//        a abcd123 abcd123@%
//        enter the line messi is best player
//        messi is best player
//        pedri Gonzales

    }
}
