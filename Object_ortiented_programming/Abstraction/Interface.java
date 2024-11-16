package Object_ortiented_programming.Abstraction;

public class Interface {
    public static void main(String[] args) {
        Queen Q =new Queen();
        Q.moves();
        //output
//       up,down,left,right,diagonal
    }
}
interface Chess{
    void moves();
}

class Queen implements Chess{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Elep implements  Chess{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements Chess{
    public void moves(){
        System.out.println("up down left right by one step only");
    }
}