package Java.Loops.patterns;

public class inverted_half_pypramid {
    public static void inv_half_pyp(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        inv_half_pyp(5);
    }
}
//output
//        *
//        **
//        ***
//        ****
//        *****
