package Recursion.Apna_college;

public class sum_of_natural_number {
    public static void main(String[] args) {
        int n=15;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n==0){
            return n;
        }
        int s=sum(n-1);
        return n+s;
    }
}

//output
//120
