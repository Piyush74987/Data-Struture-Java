//Problem Statement
//
//        You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix
//        in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st
//        index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then
//        print the sum of second largest number from both the matrices
//
//        Example
//
//        enter the size of array : 5
//        enter element at 0 index : 3
//        enter element at 1 index : 4
//        enter element at 2 index : 1
//        enter element at 3 index : 7
//        enter element at 4 index : 9
//        Sorted even array : 1 3 9
//        Sorted odd array : 4 7
//
//        7

package interview_coding_questions.Accenture;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class even_odd {
    public static void main (String[]args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.print ("Enter size of array : ");
            int arrsize = sc.nextInt ();
            int[] main = new int[arrsize];
            ArrayList < Integer > even = new < Integer > ArrayList ();
            ArrayList < Integer > odd = new < Integer > ArrayList ();
            System.out.println ("Enter " + arrsize + " Elements");
            for (int i = 0; i < arrsize; i++)
                main[i] = sc.nextInt ();
            for (int i = 0; i < arrsize; i++)
            {
                if (i % 2 == 0)
                    even.add (main[i]);
                else
                    odd.add (main[i]);
            }
            Collections.sort (even);
            Collections.sort (odd);
            System.out.println ("Sorted even array ");
            for (int e:even)
                System.out.print (e + " ");
            System.out.println ();
            System.out.println ("sorted odd array ");
            for (int e:odd)
                System.out.print (e + " ");
            System.out.println ();
            int evensec = even.get (even.size () - 2);
            int oddsec = odd.get (odd.size () - 2);
            System.out.println ("Second Largest Element in Even List is:" + evensec);
            System.out.println ("Second Largest Element in Odd List is:" + oddsec);
            System.out.println ("Sum Of Second Largest Element Of Odd and Even List:" +(evensec + oddsec));
        }

}
