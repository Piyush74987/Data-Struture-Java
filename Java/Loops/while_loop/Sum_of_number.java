package Java.Loops.while_loop;
import java.util.*;
public class Sum_of_number {
    public static void main(String[] args) {
        System.out.println("sum of the number");
        Scanner in = new Scanner (System.in);
        System.out.print("enter the number");
        int n = in.nextInt();
        int sum=0;
        int i=1;
        while (i<=n){
            sum=i+sum;
            System.out.println(sum);
            i++;
        }
        System.out.println("the final sum of 1 to n  number is"+sum);
    }
}
//output
//        sum of the number
//        enter the number 10
//        1
//        3
//        6
//        10
//        15
//        21
//        28
//        36
//        45
//        55
//        the final sum of 1 to n  number is55
