package Java.collection_framework.set;
import java.util.*;
public class Hash_set {
    public static void main(String[] args) {
        Set<Integer>hs=new HashSet<>();
        hs.add(12);
        hs.add(11);
        hs.add(33);
        hs.add(44);
        hs.add(5);
        hs.add(0);
        hs.add(111);
        System.out.println(hs);
        System.out.println(hs.contains(33));
        System.out.println(hs.isEmpty());
        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(22);
        hs1.add(33);
        System.out.println(hs1);
        hs1.clear();
        System.out.println(hs1);
        System.out.println(hs.size());



    }
}
//output
//        [0, 33, 5, 11, 12, 44, 111]
//        true
//        false
//        [33, 22]
//        []
//        7