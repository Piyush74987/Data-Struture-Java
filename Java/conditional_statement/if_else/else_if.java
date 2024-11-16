package Java.conditional_statement.if_else;
import java.util.*;
public class else_if {
    public static void main(String[] args) {
        System.out.println("else_if");
        Scanner in =new Scanner(System.in);
        System.out.println("enter first number");
        int a =in.nextInt();
        System.out.println("enter the second number");
        int b=in.nextInt();
        System.out.println("enter the third number");
        int c= in.nextInt();
        if(a>b&&a>c){
            System.out.println("this is the largest number"+a);
        }else if(b>c&&b>a){
            System.out.println("this is the largest number"+b);
        }else if(c>a&&c>b){
            System.out.println("this is the largest number"+c);
        }else if (a==b&&a==c){
            System.out.println("a and b and c are equal number");
        }else if (b==c){
            System.out.println("b and c are equal number");
        }else if (a==c){
            System.out.println("a and c are equal number");
        }else {
            System.out.println("a and b are equal");
        }

    }
}
//output 1
//        else_if
//    enter first number
//        7
//        enter the second number
//        7
//        enter the third number
//        7
//        a and b and c are equal number

//output 2
//        else_if
//        enter first number
//        6
//        enter the second number
//        9
//        enter the third number
//        22
//        this is the largest number22