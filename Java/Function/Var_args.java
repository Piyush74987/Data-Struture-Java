package Java.Function;
import java.util.Arrays;
public class Var_args {
    public static void main(String[] args) {
       fun();
       multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
       demo(1,2,3,4); // here there are two demo one for int and other for string it is called as method overloading
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));

    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a+b+Arrays.toString(v));

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
//output
//        []
//        5[Kunal, Rahul, dvytsbhusc]
//        [1, 2, 3, 4]

