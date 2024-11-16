package interview_coding_questions.Accenture;
import java.util.*;
public class Binary_to_dec {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int i = 0;
        int t = n;
        while (t > 0) {
            int r = t % 10;
            t = t / 10;
            sum += r * Math.pow(2,i++);
        }
        System.out.println((int)sum);

    }
}
