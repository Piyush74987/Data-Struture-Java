package Java.Function;

public class Max_min_func {
    public static void main(String[] args) {
        System.out.println("finding max and min through function");
        int maximum = max(5, 8, 10);
        System.out.println(maximum);
        int minmum=min(5,8,10);
        System.out.println(minmum);
        System.out.println("--------------------------------------");
        int maxi = max(33,55,11);
        System.out.println(maxi);
        int minm=min(33,55,11);
        System.out.println(minm);




    }

   public static int max(int a, int b, int c) {
//        int max ;
//
//        if (b > a && b > c) {
//            max = b;
//        } else if (c > a && c > b) {
//            max = c;
//        } else {
//            max = a;
//
//        }
//        return max;

        // aproach 2


        int max =a;

        if (b>a){
            max=b;
        }if(c>b){
            max=c;
        }
       return max;
    }
    public static int min(int a,int b, int c ){
        int min;

        if(b<a&&b<c){
            min=b;
        }
        else if (c<a&&c<b) {
            min=c;
        }
        else{
            min=a;

        }
        return min;
    }

}
//output
//        10
//        5
//        --------------------------------------
//        55
//        11