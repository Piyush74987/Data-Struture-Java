package Object_ortiented_programming.Classes;

public class classes {
    public static void main(String[] args) {
        pen p1 =new pen();
        p1.setcolour("red");
        p1.settip(5);
        System.out.println(p1.colour+"  "+p1.tip);
        pen p2 = new pen();
        p2.colour="yelow";
        System.out.println(p2.colour);
        // output
//        red  5
//        yelow
        // staring new classs

        pens p3 =new pens();
        p3.setcolour("green");
        p3.settip(7);
        System.out.println(p3.getColour());
        System.out.println(p3.gettip());
//        output
//        green
//        7


    }

}
class pen{
    int tip;
    String colour;

    void setcolour(String new_colour){
        colour=new_colour;
    }
    void settip(int new_tip){
        tip=new_tip;
    }

}

class pens{
    private int tip;
    private String colour;
    int gettip(){
        return this.tip;
    }
    String getColour(){
        return this.colour;
    }
    void setcolour(String colour){
       this.colour=colour;
    }
    void settip(int tip){
        this.tip=tip;
    }

}