//Problem: Write a program in C to display the table of a number and print the sum of all the multiples in it.
//
//        Test Cases:
//
//        Test Case 1:
//        Input:
//        5
//        Expected Result Value:
//        5, 10, 15, 20, 25, 30, 35, 40, 45, 50
//        275
//
//        Test Case 2:
//        Input:
//        12
//        Expected Result Value:
//        12, 24, 36, 48, 60, 72, 84, 96, 108, 120
//        660
package interview_coding_questions.Accenture;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Table {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Any No:");
            int no = sc.nextInt();
            int sum=0,value=1;
            for(int i=1 ; i<=10 ; i++) {
                value = no*i;
                System.out.print(value+" ");
                sum=sum+value;
            }
            System.out.println("\nSum is : "+sum);
        }
}
