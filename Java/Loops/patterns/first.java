package Java.Loops.patterns;

public class first {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        System.out.println("--------------------");
        for(int i =1;i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
