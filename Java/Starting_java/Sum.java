package Java.Starting_java;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("This is example of sum");
        Scanner input = new Scanner (System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("the addation of num "+ num1+num2);
        System.out.println("The Sum of the Number is "+sum);

    }
}

//output
//        This is example of sum
//        10
//        20
//        the addation of num 1020
//        The Sum of the Number is 30


