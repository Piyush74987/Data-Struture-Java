package Java.collection_framework.Queue;
import java.util.*;
public class queue_linkedlist {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(5);
        que.offer(6);
        que.offer(7);
        System.out.println(que);
        System.out.println(que.peek());// element that will remove next
        que.poll();
        System.out.println(que);
    }
}
//output
//        [5, 6, 7]
//        5
//        [6, 7]