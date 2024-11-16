package Java.Basic_Problem;

import java.util.*;


public class f_c {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s_f = in.nextInt();
        int e_f = in.nextInt();
        int s_w = in.nextInt();
        while (s_f == e_f) {
            int c = (int) (s_f - 32) * 5 / 9;
            s_f += s_w;
            System.out.println(s_f + " " + c);
        }
    }
}
