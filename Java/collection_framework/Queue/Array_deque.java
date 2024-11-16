package Java.collection_framework.Queue;
import java.util.*;
public class Array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer>aq=new ArrayDeque<>();
        aq.offer(55);
        aq.offerFirst(33);
        aq.offerLast(99);
        aq.offer(65);
        System.out.println(aq);
        System.out.println(aq.peek());
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
        aq.poll();
        System.out.println(aq);
        aq.pollFirst();
        System.out.println(aq);
        aq.pollLast();
        System.out.println(aq);
    }
}
//output
//        [33, 55, 99, 65]
//        33
//        33
//        65
//        [55, 99, 65]
//        [99, 65]
//        [99]