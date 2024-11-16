package Java.Loops.patterns;
import java.util.*;

public class Alpabet_pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("enter the number");
        int n = in.nextInt();
        char ch ='A';
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("  ");
        }


    }
}
//output
//        enter the number 5
//        A
//        BC
//        DEF
//        GHIJ
//        KLMNO