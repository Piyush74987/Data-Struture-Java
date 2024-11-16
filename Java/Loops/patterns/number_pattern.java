package Java.Loops.patterns;
import java.util.*;
public class number_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n=in.nextInt();
        for (int i=1;i<=n;i++){
            for(int number=1;number<=i;number++){
                System.out.print(number);
            }
            System.out.println(" ");
        }


    }
}
//output
//        7
//        1
//        12
//        123
//        1234
//        12345
//        123456
//        1234567
