package Recursion;

public class inc_number {
    public static void main(String[] args) {
        int s =0;
        int e=15;
        inc_number(s,e);
        System.out.println("--------------");
        inc_print(e);

    }

    public static void inc_number(int n,int e){
        if(n==e){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        inc_number(n+1,e);
    }

    public static void inc_print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        inc_print(n-1);
        System.out.println(n);
    }


}
//output
//        0
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
//--------------
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        11
//        12
//        13
//        14
//        15
