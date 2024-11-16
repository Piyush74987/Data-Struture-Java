package Object_ortiented_programming.inhertance;

public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Star sun =new Star();
        sun.colour="yellow";
        sun.age=1000000;
        System.out.println(sun.age+" "+sun.colour);
        Planets earth =new Planets();
        earth.age=10000;
        earth.colour="blue and brown";
        System.out.println(earth.age+" "+earth.colour);
        earth.surival(true);
//        output
//        1000000 yellow
//        10000 blue and brown
//        yes u can surival

    }
}
class Solar_system{
    int age;
}
class Star extends Solar_system{
    String colour;

}
class Planets extends Solar_system{
    String colour;
    void surival(boolean a){
        if(a==true){
            System.out.println("yes u can surival");
        }else{
            System.out.println("u cant surival");
        }

    }
}