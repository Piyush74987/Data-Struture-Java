package Java.conditional_loop;

import java.util.Scanner;

public class fibonacci {


    public static void fibo(int n){
        int a=0;
        int b= 1;
        int count =2;

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count ++;
            System.out.println(b);
        }

        System.out.println("the fibonacci series at n number is  "+b);
    }
    public static void main(String[] args) {
        System.out.println("The fibonacci series");
        fibo(10);


    }
}
//output
//        The fibonacci series
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34
//        55
//        the fibonacci series at n number is  55