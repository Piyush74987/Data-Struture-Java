package Java.conditional_loop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the operator '+','-','*','/','%'");
        System.out.print("Enter the operator  ");
        char op = in.next().trim().charAt(0);
        int ans=0;


        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            System.out.print("Enter the first numbers : ");
            int a =in.nextInt();
            System.out.print("Enter the second numbers : ");
            int b =in.nextInt();

            if(op=='+'){
                ans=a+b;
                System.out.println("The ans of addition is "+ ans);
            }
            if(op=='-'){
                ans=a-b;
                System.out.println("The ans of substration is "+ ans);
            }
            if(op=='*'){
                ans=a*b;
                System.out.println("The ans of multiplication is "+ ans);
            }
            if(op=='/'){
                ans=a/b;
                System.out.println("The ans of division is "+ ans);
            }
            if(op=='%'){
                ans=a%b;
                System.out.println("The ans of modulo is "+ ans);
            }
        }else{
            System.out.println("The operator is wrong");
        }

    }
}
//output
//        Calculator
//        Enter the operator '+','-','*','/','%'
//        Enter the operator  &
//        The operator is wrong

//           Calculator
//                   Enter the operator '+','-','*','/','%'
//                   Enter the operator  *
//                   Enter the first numbers : 10
//                   Enter the second numbers : 12
//                   The ans of multiplication is 120