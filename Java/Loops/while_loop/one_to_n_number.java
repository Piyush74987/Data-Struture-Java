package Java.Loops.while_loop;
import java.util.*;
public class one_to_n_number {
    public static void main(String[] args) {
        System.out.println("1 to n number printing");
        Scanner in =new Scanner (System.in);
        System.out.print("Enter the number till u want to print ");
        int n =in.nextInt();
        int i =0;
        while (i<=n){
            System.out.println(i);
            i++;
        }
//        output
//        0
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
    }
}
