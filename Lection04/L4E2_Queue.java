// Queue:
// Работает по принципу FIFO - First Input First Output

// Queue -> Deque -> LinkedList + ArrayDeque
// Queue -> AbstractQueue -> PriorityQueue

//  PriorityQueue - наивысший приоритет имеет "наименьший" элемент

//  Deque - double ended queue: 
//  линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах



package Lection04;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class L4E2_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(4);
        queue.add(2);
        System.out.println(queue);                      // [1, 3, 4, 2]
        queue.remove();
        System.out.println(queue);                      // [3, 4, 2]
        queue.add(5);
        System.out.println(queue);                      // [3, 4, 2, 5]

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);                         // [1, 3, 13, 123]
        System.out.println(pq.poll());                  // 1
        System.out.println(pq.poll());                  // 3
        System.out.println(pq.poll());                  // 13
        System.out.println(pq.poll());                  // 123
        System.out.println(pq.poll());                  // null

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst((1)); deque.addLast(2);
        System.out.println(deque);                      // [1, 2]
        deque.removeLast(); deque.removeLast();
        System.out.println(deque);                      // []
        deque.offerFirst(1); deque.offerLast(2);
        System.out.println(deque);                      // [1, 2]
        deque.pollFirst(); deque.pollLast();
        System.out.println(deque);                      // []
        deque.addFirst((1)); deque.addLast(2);
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}
