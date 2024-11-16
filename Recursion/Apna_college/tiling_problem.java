package Recursion.Apna_college;

public class tiling_problem {
    public static void main(String[] args) {
        System.out.println(tiling(4));

    }

    public static int tiling(int n){
        if(n==0||n==1){
            return 1;
        }
        int ver=tiling(n-1);
        int hor=tiling(n-2);
        return ver+hor;
    }
}
