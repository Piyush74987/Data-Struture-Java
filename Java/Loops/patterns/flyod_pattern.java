package Java.Loops.patterns;
import java.util.*;
public class flyod_pattern {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int n= in.nextInt();
        int s=1;
        for (int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(s);
                s++;
            }
            System.out.println(" ");
        }

    }
}
//output
//        4
//        1
//        23
//        456
//        78910
