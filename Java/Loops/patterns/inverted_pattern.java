package Java.Loops.patterns;
import java.util.*;

public class inverted_pattern {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        System.out.print("please enter the number");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
//output
//    please enter the number 5
//        *****
//        ****
//        ***
//        **
//        *
