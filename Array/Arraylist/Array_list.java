package Array.Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args) {
        // syntax
        // ArrayList<data type>name=new Arraylist<>()intial capaticty
        ArrayList<Integer>li =new ArrayList<>(5);
        Scanner in=new Scanner(System.in);

        li.add(3);
        li.add(1,5);
        li.add(4);

        System.out.println(li.get(1));
       li.remove(2);

        for (int i = 0; i < 5; i++) {
            li.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(li.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(li);


    }

}
//output:
//        5
//        3
//        4
//        5
//        6
//        7
//        3
//        5
//        3
//        4
//        5
//        [3, 5, 3, 4, 5, 6, 7]