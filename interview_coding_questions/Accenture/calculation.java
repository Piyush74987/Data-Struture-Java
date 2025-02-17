//Problem Statement
//
//        You are required to implement the following function.
//
//        Int OperationChoices(int c, int n, int a , int b )
//
//        The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments. Implement the function to return.
//
//        ( a+ b ) , if c=1
//        ( a – b ) , if c=2
//        ( a * b ) ,  if c=3
//        (a / b) ,  if c =4
//        Assumption : All operations will result in integer output.
//
//        Example:
//
//        Input
//        c :1
//        a:12
//        b:16
//        Output:
//        Since ‘c’=1 , (12+16) is performed which is equal to 28 , hence 28 is returned.
//        Sample Input
//
//        c : 2
//
//        a : 16
//
//        b : 20
//
//        Sample Output
//
//        -4
package interview_coding_questions.Accenture;
import java.util.*;
public class calculation {

        public static int operationChoices (int c, int a, int b)
        {
            int res = 0;
            switch (c)
            {
                case 1:
                    res = a + b;
                    break;
                case 2:res = a - b;
                    break;
                case 3:res = a * b;
                    break;
                case 4:res = a / b;
                    break;
            }
            return res;
        }
        public static void main (String[]args)
        {
            Scanner sc = new Scanner (System.in);
            int c = sc.nextInt ();
            int a = sc.nextInt ();
            int b = sc.nextInt ();

            System.out.println (operationChoices (c, a, b));
        }

}
