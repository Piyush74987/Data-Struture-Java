package Recursion.Apna_college;

public class fibnacci_num {
    public static void main(String[] args){
        int n=7;

        System.out.println(fibnacci(n));

    }
    public static int fibnacci(int n){
        if(n<=1){
            return n;
        }
        int fib1=fibnacci(n-1);
        int fib2=fibnacci(n-2);
        return fib1+fib2;
    }

}

//output
//        21