package Java.collection_framework.list;
//import java.util.Stack;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<String>animal=new Stack<>();
        animal.push("lion");
        animal.push("tiger");
        animal.push("cat");
        animal.push("dog");
        animal.push("shark");
        System.out.println(animal);
        System.out.println(animal.peek());//peek =top element
        animal.pop();
        System.out.println(animal);
        animal.pop();
        System.out.println(animal.empty());
        System.out.println(animal.get(2));
        System.out.println(animal);
//output
//        [lion, tiger, cat, dog, shark]
//        shark
//        [lion, tiger, cat, dog]
//        false
//        cat
//        [lion, tiger, cat]
//
    }

}
