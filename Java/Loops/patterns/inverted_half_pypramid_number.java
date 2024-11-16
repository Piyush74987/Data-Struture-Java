package Java.Loops.patterns;

public class inverted_half_pypramid_number {

        public static void inv_half_pyp(int n){

            for(int i=1;i<=n;i++){
                int s=1;
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(s);
                    s++;
                }
                System.out.println(" ");
            }
        }

        public static void main(String[] args) {

            inv_half_pyp(4);
        }
    }
//    output
//               1
//              12
//             123
//            1234


