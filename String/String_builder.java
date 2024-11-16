package String;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder(" ");
        for(char i='a';i<='z';i++){
            sb1.append(i);
        }
        System.out.println(sb1);
        System.out.println(sb1.length());
    }
}
//output
//        abc
// abcdefghijklmnopqrstuvwxyz
//         27
