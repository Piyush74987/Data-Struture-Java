package Java.Function;

import java.util.Scanner;

public class max_apprach_3 {
    public static void main(String[] args) {
        System.out.println("apprach 3");
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the first number");
        int a=in.nextInt();
        System.out.print("Enter the second number");
        int b=in.nextInt();
        System.out.print("Enter the third number");
        int c=in.nextInt();

        int max;
        max=Math.max(c,Math.max(a,b));
        System.out.println("The Maximum number is "+max);
    }
}
//output
//
//        apprach 3
//        Enter the first number 88
//        Enter the second number93
//        Enter the third number105
//        The Maximum number is 105