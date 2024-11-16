package Recursion.Apna_college;

public class fac_n {
    public static void main(String[] args) {
        int n =5;
        int ans=fac(n);
        System.out.println(ans);


    }
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int nm1=fac(n-1);
        return n*nm1;
    }
}
// output
//120