package interview_coding_questions.Accenture;
import java.util.*;
public class ship_transport {
    public static int transport_round(int c,int p){
        if(c>p){
            return 1;
        }
        int count=0;
        while(p>0){
            p=p-c;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int c=sc.nextInt();
        int p=sc.nextInt();
        System.out.println(transport_round(c,p));
    }
}
