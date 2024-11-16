package Object_ortiented_programming.polymorphism;

public class Method_overridding {
    public static void main(String[] args) {
        Deer d =new Deer();
        d.eat();
//        output
//        eating grass

    }
}
class Animal{
    void eat(){
        System.out.println("eating anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eating grass");
    }
}