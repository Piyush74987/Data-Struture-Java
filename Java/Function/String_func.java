package Java.Function;
import java.util.Scanner;

public class String_func {
    public static void main(String[] args) {
        String message = greet();
       System.out.println(message);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name) {

        return  "Hello " + name;

    }


    static String greet() {
        return "how are you";
    }
}
//output
//        how are you
//        Enter your name: piyush
//        Hello piyush
