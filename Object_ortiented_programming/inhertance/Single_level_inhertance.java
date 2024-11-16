package Object_ortiented_programming.inhertance;

public class Single_level_inhertance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.breath="yes_he_breath";
        System.out.println(shark.breath);
        shark.eat();
        shark.fins();
//        output
//        yes_he_breath
//        eating
//        fish can swim
    }
}
class Animal{
    String breath;
    void eat(){
        System.out.println("eating");
    }
}
class Fish extends Animal{

    void fins(){
        System.out.println("fish can swim");
    }
        }
