package Java.Loops.patterns;
import java.util.*;
public class Hollow_rectangle_pattern {
    public static void hollow_rectangle(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n ){
                    System.out.print("*");
                }
                else if (j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        System.out.print("Enter the number of rows");
//        int rows=in.nextInt();
//        System.out.print("Enter the number of col");
//        int col= in.nextInt();
        hollow_rectangle(10);
    }
}
//output
//        *****
//        *   *
//        *   *
//        *****
