package Java.Function;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c=33;
        int d=44;

        // swap numbers code
        int temp = c;
        c= d;
        d = temp;
        System.out.println(c +"  "+d); // here swap will happen

        swap(a, b);
        System.out.println(a + " " + b);


        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
    }


}
//output
//
//        44  33
//        10 20
//        Kunal Kushwaha

