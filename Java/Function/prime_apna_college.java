package Java.Function;
import java.util.*;
public class prime_apna_college {

//    public static boolean is_prime(int n){
//        if(n==2){
//            return true;
//        }
//        for (int i=2;i<n;i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//
//    return true;
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner (System.in);
//        int n =in.nextInt();
//        System.out.println(is_prime(n));
//
//
//    }
//}
//output
//        19
//        true


    public static boolean is_prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void print_prime(int n){
        for(int i=1;i<=n;i++){
            if(is_prime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n =in.nextInt();
        print_prime(n);

    }
}
//100
// 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97