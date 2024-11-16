package Java.Function;

public class Method_overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Kunal Kushwaha");
        int ans = sum(3, 4);
        System.out.println(ans);
        int answer=sum(3,5,10);
        System.out.println(answer);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
//output
//        first one
//        67
//        Second one
//        Kunal Kushwaha
//        7
//        18
