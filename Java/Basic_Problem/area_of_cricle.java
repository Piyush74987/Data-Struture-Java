package Java.Basic_Problem;

import java.util.Scanner;

public class area_of_cricle {
    public static void main(String[] args) {
        System.out.println("This is an example of area of circle");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius");
        int r =in.nextInt();

        if (r!=0){
            float A =0f;
            float p=3.14f;

            A= p*(r*r);

            System.out.println(A);

        }else{
            System.out.println("No circle exists");
        }
    }

}
//output
//        This is an example of area of circle
//        Enter the radius 5
//        78.5