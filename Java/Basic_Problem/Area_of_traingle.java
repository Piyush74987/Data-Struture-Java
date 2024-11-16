package Java.Basic_Problem;

import java.util.Scanner;
public class Area_of_traingle {
    public static void main(String[] args){
        System.out.println("area of traingle");
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the height of traingle  ");
        int h =  in.nextInt();
        System.out.print("enter the base of traingle  ");
        int b =  in.nextInt();

        if(h!=0&&b!=0){
            float A = 0f;
            float i =0.5f;
            A=i*h*b;
            System.out.println(A);
        }else{
            System.out.println("Lenght or breath can't be zero");
        }


    }

}
//output
//
//        area of traingle
//        Enter the height of traingle  20
//        enter the base of traingle  5
//        50.0