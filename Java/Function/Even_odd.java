package Java.Function;

public class Even_odd {

    public static void main(String[] args) {
        System.out.println("Program of even and odd ");
          even_odd(33);
          even_odd(42);


    }
    public static void even_odd(int a){
        if(a%2==0){
            System.out.println("Given the number is Even " +a);
        }else{
            System.out.println("Given the number is Odd "+a);
        }



    }
}
//output
//        Program of even and odd
//        Given the number is Odd 33
//        Given the number is Even 42