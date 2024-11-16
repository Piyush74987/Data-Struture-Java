package Recursion.Apna_college;

public class dec_number {
    public static void main(String[] args) {
        int n =10;
        dec_number(n);

    }

    public static void dec_number(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        dec_number(n-1);
    }
}
//output
//        10
//        9
//        8
//        7
//        6
//        5
//        4
//        3
//        2
//        1
