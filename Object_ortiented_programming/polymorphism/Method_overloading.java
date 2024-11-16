package Object_ortiented_programming.polymorphism;

public class Method_overloading {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.sum(3,4));
        System.out.println(cal.sum((float) 3.4,(float) 4.5));
        System.out.println(cal.sum(3,6,9));
//        output
//        7
//        7.9
//        18
    }
}

class Calculator{
    int sum (int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
