package Java.Basic_Problem;

import java.util.Scanner;

public class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        System.out.println("Perimeter Of Rectangle");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the lenght of the Rectangle  ");
        int l= input.nextInt();
        System.out.print("Enter the width of the Rectangle   ");
        int w=input.nextInt();
        int p=0;
        int i=2;

        p=(l*w)*i;

        System.out.println(p);
    }
}
//output
//        Perimeter Of Rectangle
//        Enter the lenght of the Rectangle  25
//        Enter the width of the Rectangle   15
//        750
