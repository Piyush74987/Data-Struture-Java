//Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. The submitted code should be logically/syntactically correct and pass all the test cases.
//
//        Ques: The program is supposed to calculate the sum of  distance between three points from each other.
//
//        For
//        x1 = 1 y1 = 1
//        x2 = 2 y2 = 4
//        x3 = 3 y3 = 6
//
//        Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2

package interview_coding_questions.Accenture;
import java.util.*;
public class Distance {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float x3 = sc.nextFloat();
        float y3 = sc.nextFloat();
        float firstDiff =(float) Math.sqrt (Math.pow (x2 - x1, 2) + Math.pow (y2 - y1, 2));
        float secondDiff =(float) Math.sqrt (Math.pow (x3 - x2, 2) + Math.pow (y3 - y2, 2));
        float thirdDiff =(float) Math.sqrt (Math.pow (x3 - x1, 2) + Math.pow (y3 - y1, 2));
        System.out.println (firstDiff + secondDiff + thirdDiff);
    }
}