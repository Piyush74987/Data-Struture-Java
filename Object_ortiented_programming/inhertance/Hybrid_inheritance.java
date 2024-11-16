package Object_ortiented_programming.inhertance;

public class Hybrid_inheritance {
    public static void main(String[] args) {
        B b=new B();
        b.colour="red";// A class
        b.number=3;// b class
        System.out.println(b.colour+" "+b.number);
        b.num();// B class fun
        b.hello();// A class fun
//        output
//        red 3
//        B is hello
//        A is hello
        D d =new D();
        d.colour="green";// A class
        d.number=4;//B class
        d.name="piyu"; //D class
        System.out.println(d.colour+" "+d.number+" "+d.name);
        d.num();//  B class
        d.lum();//  D class
        d.hello();// A class
//        output
//        green 4 piyu
//        B is hello
//        D is hello
//        A is hello

//                  A
//                  |
//        -------------------------
//        |                       |
//        B                        C
//        |
//        ----------|
//                  D
//
//
//
    }
}
class A{
    String colour;
    void hello(){
        System.out.println("A is hello");
    }
}
class B extends A{
    int number;
    void num(){
        System.out.println("B is hello");
    }
}
class C extends A{
    int s;
    void sum(){
        System.out.println("C is hello");
    }
}
class D extends B{
    String name;
    void lum(){
        System.out.println("D is hello");
    }

}