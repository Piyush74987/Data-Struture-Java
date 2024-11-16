package Java.conditional_loop;

import java.util.Scanner;

public class alphabet_case_check {
    public static void main(String[] args) {
        System.out.println("alphabet_case_check");
        Scanner input =new Scanner(System.in);
        System.out.print("enter the word or line");
        char ch = input.next().trim().charAt(0);

        if(ch>='a'&& ch<='z'){
            System.out.println("the char is lowercase");

        }else if(ch>='A'&&ch<='Z'){
            System.out.println("the char is uppercase");
        }else{
            System.out.println("it is not a char");
        }
    }
}
//output
//        for lowercase
//        alphabet_case_check
//        enter the word or line heello
//        the char is lowercase
//
//        for uppercase
//
//        alphabet_case_check
//        enter the word or line Piyush mali is great man
//        the char is uppercase