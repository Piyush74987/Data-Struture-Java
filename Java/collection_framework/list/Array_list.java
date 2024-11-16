package Java.collection_framework.list;
 import javax.swing.text.html.HTMLDocument;
 import java.util.ArrayList;
 import java.util.List;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();// way to create a list
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(1);
        list.add(2,0);
        System.out.println(list);
        // output  [5, 3,0,6, 7, 8, 2, 1]
        List<Integer>newli=new ArrayList<>();// 2 way to create a list
        newli.add(120);
        newli.add(130);
        System.out.println(newli);
        list.addAll(newli);
        System.out.println(list);// output = [5, 3, 0, 6, 7, 8, 2, 1, 120, 130]
        System.out.println(list.get(2));// output =0
        list.remove(3);
        list.remove(Integer.valueOf(130));
        newli.clear();
        System.out.println(list);
        System.out.println(newli);
        list.set(5,55);// using for updating the value
        System.out.println(list);
        System.out.println(list.contains(55));
//output
//        [5, 3, 0, 6, 7, 8, 2, 1]
//        [120, 130]
//        [5, 3, 0, 6, 7, 8, 2, 1, 120, 130]
//        0
//        [5, 3, 0, 7, 8, 2, 1, 120]
//        []
//        [5, 3, 0, 7, 8, 55, 1, 120]
//        true
    }
}
