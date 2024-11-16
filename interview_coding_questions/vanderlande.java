package interview_coding_questions;
import java.util.*;
public class vanderlande {

    public static int small_number(int n, int[] H){
        int result=0;
        if(H[0]<H[1]){
            result++;
        }
        if(H[n-1]<H[n-2]) {
            result ++;
        }
        for(int i=1;i<n-1;i++){
            if(H[i]<H[i-1]&&H[i]<H[i+1]){
                result++;
            }
        }
        if(result==0){
            result=-404;
        }
      return  result;
    }
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print("enter number of inputs");
        int n =in.nextInt();
        int H[]=new int[n];
        for(int i=0;i<n;i++){
           H[i]= in.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(H[i]+" ");
        }
        System.out.println(" ");
        int s=small_number(n,H);
        System.out.println(s);

    }
}
//result
//        enter number of inputs 5
//        1
//        2
//        3
//        2
//        1
//        1 2 3 2 1
//        2