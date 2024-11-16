package interview_coding_questions.Accenture;
import java.util.*;
public class fibonncai {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        int soution=F(n);
        System.out.println(soution);



    }
    public static int F(int n){
        if(n<=2){
            return 1;
        }
        int f1=F(n-1);
        int f2=F(n-2);
        return f1+f2 ;
    }
}
