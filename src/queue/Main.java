package queue;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // To insert an element in the queue use "offer"
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }

        // to see the contents of the queue
        System.out.println(queue);

        // Retrieves and removes the header from the queue.
        queue.remove();
        System.out.println(queue);

        // Retrieves, but does not remove, the head of the queue,
        // or returns null if this queue is empty.
        System.out.println(queue.peek());

        // Retrieves and removes the head of this queue,
        // or returns null if this queue is empty.
        System.out.println(queue.poll());

        /*
        Inserts the specified element into this queue
        if it is possible to do so immediately without violating
        capacity restrictions, returning true upon success and
        throwing an IllegalStateException if no space is currently
        available.
        */
        queue.add(55);
        System.out.println(queue);
    }
}
