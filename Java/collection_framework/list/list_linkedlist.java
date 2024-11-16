package Java.collection_framework.list;
import java.util.*;
public class list_linkedlist {
    public static void main(String[] args) {
        List<Integer>link=new LinkedList<>();
        link.add(5);
        link.add(6);
        link.add(7);
        link.add(8);
        link.add(9);
        link.add(0);
        link.add(3);
        System.out.println(link);
        link.remove(4);
        System.out.println(link);
        System.out.println(link.get(4));

    }
}
//output
//        [5, 6, 7, 8, 9, 0, 3]
//        [5, 6, 7, 8, 0, 3]
//        0
