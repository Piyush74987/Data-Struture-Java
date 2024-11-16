package Java.collection_framework.list;
import java.util.*;
// the differnce between vector and arraylist is vector does one work at a time and array list can do multpile work at a time
// so vector also extends stack as stack also does one work at a time
public class vector {
    public static void main(String[] args) {
        Vector<Integer> vec= new Vector<Integer>();
        vec.add(33);
        vec.add(22);
        vec.add(44);
        System.out.println(vec);
        vec.add(99);
        vec.set(1,55);
        System.out.println(vec);
        System.out.println(vec.contains(55));
        System.out.println(vec.capacity());
        System.out.println(vec.size());
        vec.remove(3);
        System.out.println(vec);
        vec.clear();
        System.out.println(vec);


    }
}
//output
//        [33, 22, 44]
//        [33, 55, 44, 99]
//        true
//        10
//        4
//        [33, 55, 44]
//         []
