package Object_ortiented_programming.inhertance;

public class Multi_level_inheritance {
    public static void main(String[] args) {
        Dogs d1= new Dogs();
        d1.breath="yes_he_breath";
        d1.legs=4;
        System.out.println(d1.breath+" "+d1.legs);
        d1.eats();
        d1.walks();
//        output
//        yes_he_breath 4
//        eating
//        mammals can walk

    }

}
class Animals{
    String breath;
    void eats(){
        System.out.println("eating");
    }
}
class Mammals extends Animals{
    void walks(){
        System.out.println("mammals can walk");
    }
}
class Dogs extends Mammals{
    int legs;
}