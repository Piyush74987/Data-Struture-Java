package Java.collection_framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Tree_map {
    public static void main(String[] args) {
        Map<String,Integer> stud_id=new HashMap<>();
        stud_id.put("aa",6);
        stud_id.put("pedri",1);
        stud_id.put("messi",2);
        stud_id.put("gavi",3);
        System.out.println(stud_id);
        stud_id.put("pedri",4);
        System.out.println(stud_id);// when we use same key is overrides it
        stud_id.putIfAbsent("pedri",1);
        System.out.println(stud_id);
        System.out.println(stud_id.size());
        System.out.println(stud_id.keySet());
        System.out.println(stud_id.values());
    }
}
//output
//{aa=6, gavi=3, messi=2, pedri=1}
//        {aa=6, gavi=3, messi=2, pedri=4}
//        {aa=6, gavi=3, messi=2, pedri=4}
//        4
//        [aa, gavi, messi, pedri]
//        [6, 3, 2, 4]
