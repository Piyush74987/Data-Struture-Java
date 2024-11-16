package String.Apna_college;

public class Substring {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str,0,5));
    }

    public static String substring(String str,int sp,int ep){
        String str1=" ";

        for (int i = sp; i < ep; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }
}
//output
// hello
// hello