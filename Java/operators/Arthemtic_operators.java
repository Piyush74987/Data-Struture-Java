package Java.operators;

public class Arthemtic_operators {
    public static void main(String[] args) {
        // arthemtic operators are of two types unary and binary
        // 1] binary
        int a =5;
        int b=10;
        int sum ;
        sum = a+b; // sum = a+b is expersion , a and b are operands , (+) is operator
        System.out.println("addition"+sum);
        System.out.println("sub"+(a-b));
        System.out.println("multiply"+(a*b));
        System.out.println("division"+(a/b));
        System.out.println("modulo(rem)"+(a%b));

        // unary
        int c=10;
        int d=c++;
        int f=++c;
        int e=--c;
        int g=c--;
        System.out.println("c="+c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(e);
        System.out.println(g);

    }
}
//output
//        addition15
//sub-5
//        multiply50
//        division0
//        modulo(rem)5
//        c=10
//        10
//        12
//        11
//        11