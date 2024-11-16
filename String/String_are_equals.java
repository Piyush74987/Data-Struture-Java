package String;

public class String_are_equals {
    public static void main(String[] args) {
        String str="messi";
        String str1="messi";
        String str2= new String("messi");

        if(str==str1){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(str==str2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

        if(str.equals(str1)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(str.equals(str2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        //output
//        equal
//        not equal
//        equal
//        equal
    }
}
