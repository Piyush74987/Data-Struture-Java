package Java.operators;

import org.w3c.dom.ls.LSOutput;

public class Assignment_operator {
    public static void main(String[] args) {
        // assignment operators
        // =,+=,-=,*=,/=

        int a = 5;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        a+=5;//a=a+5
        System.out.println(a);
        a-=2;//a=a-2
        System.out.println(a);
        a*=2;//a=a*2
        System.out.println(a);
        a/=4;//a=a/4
        System.out.println(a);

    }
}
//output
//        5
//        5
//        10
//        8
//        16
//        4
