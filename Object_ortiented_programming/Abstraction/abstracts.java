package Object_ortiented_programming.Abstraction;

public class abstracts {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
        Chicken ch=new Chicken();
        ch.walk();
        ch.eat();
//        output
//        walk in 4 legs
//        eating anything
//        walk in 2 legs
//        eating anything

        // understanding which construtor is called in inheritance first
//        Animal construtor
//        Horse construtor
//        walk in 4 legs
//        eating anything
//        Animal construtor
//        Chicken construtor
//        walk in 2 legs
//        eating anything


    }
}
abstract class Animal{
    String colour;
    Animal(){
        System.out.println("Animal construtor");
        colour="brown";
    }
    void eat (){
        System.out.println("eating anything");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse construtor");
    }
    void walk(){
        System.out.println("walk in 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken construtor");
    }
    void walk(){
        System.out.println("walk in 2 legs");
    }
}
