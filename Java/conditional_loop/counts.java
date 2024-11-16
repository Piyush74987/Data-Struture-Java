package Java.conditional_loop;

import java.util.Scanner;

public class counts {
    public static void main(String[] args) {
        System.out.println("find total number in mun");
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();
        int count=1; // count is here one as when last number is zero it will not print that why

        while(count<=num){
            num=num/10;
            count++;
        }
        System.out.println(count);


        int s=333;
        s=s/10;
        System.out.println(s);
        s=s/10;
        System.out.println(s);
        s=s/10;
        System.out.println(s);
    }
}
