package Java.conditional_statement.swtich_statement;
import java.util.*;
public class switch_statement {
    public static void main(String[] args) {
        System.out.println("switch statement");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number between 1 to 5");
        System.out.print("Enter the number");
        int number =input.nextInt();
            switch (number){
                case 1 :
                    System.out.println("the number is one");
                    break;
                case 2 :
                    System.out.println("the number is two");
                    break;
                case 3 :
                    System.out.println("the number is three");
                    break;
                case 4 :
                    System.out.println("the number is four");
                    break;
                case 5 :
                    System.out.println("the number is five");
                    break;
                default :
                    System.out.println("Please enter vaild number");
            }


    }
}
//output
//        switch statement
//        enter the number between 1 to 5
//        Enter the number3
//        the number is three

//output 2
//        switch statement
//        enter the number between 1 to 5
//        Enter the number 8
//        Please enter vaild number