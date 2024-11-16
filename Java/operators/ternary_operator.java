package Java.operators;
import java.util.*;
public class ternary_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter the number");
        int number=input.nextInt();
        String value =(number%2==0)?"even":"odd";
        System.out.println(value);
    }
}
//output
//        enter the number
//        5
//        odd
//
//output 2
//        enter the number
//        6
//        even