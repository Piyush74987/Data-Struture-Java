package Object_ortiented_programming.Abstraction;

public class Multiple_inheritance {
    public static void main(String[] args) {
        C c=new C ();
        c.lum();
        c.sum();
//        output
//        lum
//        sum
    }
}
interface A{
    void sum();
}
interface B{
    void lum();
}

class C implements A,B{
    public void sum(){
        System.out.println("sum");
    }
    public void lum(){
        System.out.println("lum");
    }
}