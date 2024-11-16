package Recursion.Apna_college;

public class power_n {
    public static void main(String[] args) {
        int n=2;
        int p=10;
        System.out.println(Math.pow(n,p));
        System.out.println(power(n,p));
        System.out.println(power_optimazed(n,p));
    }

    public static int power(int n ,int s){
        if(s==1){
            return n;
        }
        return n*power(n,s-1);
    }
    //output
    //1024
    public static int power_optimazed(int n ,int s){
        if(s==1){
            return n;
        }
        int halfequare=power_optimazed(n,s/2);
        int fullsquare=halfequare*halfequare;
        if(s%2!=0){
            fullsquare=n*fullsquare;
        }
        return fullsquare;
    }
    // output
    //1024

}
