package Java.collection_framework.Queue;
import java.util.*;

public class priorityQueue {


//    public static void main(String[] args) {
//        PriorityQueue<Integer>pq= new PriorityQueue<>(); // minium is always
//        pq.offer(15);
//        pq.offer(55);
//        pq.offer(35);
//        pq.offer(25);
//        pq.offer(1);
//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq);
////        output
////                [1, 15, 35, 55, 25]
////                15
////                [25, 55, 35]
//    }
      public static void main(String[] args) {
          Queue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
          pq.offer(15);
          pq.offer(15);
        pq.offer(55);
        pq.offer(35);
        pq.offer(25);
        pq.offer(1);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
//        output
//                [55, 35, 15, 15, 25, 1]
//                  35
//                  [25, 15, 15, 1]
      }
}
