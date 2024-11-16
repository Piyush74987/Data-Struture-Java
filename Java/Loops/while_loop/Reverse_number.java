//imp points
//        1] whenever we need to find last digit of a number use modulo (%) it will always give u last number
//        2] whenever we need to remove last number we need to use divison (/) it  will remove the last number


package Java.Loops.while_loop;

public class Reverse_number {
    public static void main(String[] args) {
//        int n = 19112003;
//        while(n>0){
//            int last_digit=n%10;
//            System.out.print(last_digit+" ");
//            n =n/10;
//            output
//            3 0 0 2 1 1 9 1
//        }
        int n= 19112003;
        int rev=0;
        while(n>0){
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        System.out.println(rev);
    }
//    output
//    30021191

}
