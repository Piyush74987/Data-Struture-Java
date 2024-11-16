package Java.conditional_loop;

import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {
        System.out.println("Enter the number of counts");
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int count=0;

        while(count<=a){
                int rem = a % 10;
                if (rem == 5) {  // this will help to find number of 5 in the number
                    count++;
                }
                a = a / 10; // n /= 10
            }

            System.out.println(count);
        }
    }
//output
//        Enter the number of counts
//        454545
//        3
