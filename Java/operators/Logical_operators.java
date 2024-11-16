package Java.operators;

public class Logical_operators {
    public static void main(String[] args) {
        // logical operators
        // && and ,|| or ,! not

        int a= 5;
        int b= 25;
        int c= 10;
        int d= 15;
        if(a<=b&&c<=b){
            System.out.println("and operators both need to be true");
        }
        if(a>=b||c<=d){
            System.out.println("or operator anu one  need to true ");
        }
        System.out.println(!(a<b));
        System.out.println("in above we can see that a is smaller than b when we use not(!) it gives opposite ");

    }
}
//output
//        and operators both need to be true
//        or operator any one  need to true
//        false
//        in above we can see that a is smaller than b when we use not(!) it gives opposite