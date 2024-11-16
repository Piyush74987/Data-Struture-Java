package Java.Starting_java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       System.out.println("This is Example of Input");
       Scanner input = new Scanner(System.in);
       System.out.println(input.nextInt());
       int rollno = input.nextInt();
       System.out.println("This is my roll no "+rollno);
       // this is used for string same way can use for float,long,double

        Scanner obj=new Scanner(System.in);
        String name=obj.nextLine(); // input or obj are just object to access input
        System.out.println(name);




//        float price=input.nextFloat();
//        System.out.println(price);
    }
}

// output
//
//         This is Example of Input
//         33
//         33
//         95
//         This is my roll no 95
//         piyush
//         piyush
