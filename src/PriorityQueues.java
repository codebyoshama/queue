import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b -a);
        // Enqueue operation
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);

        // Dequeue operation
        System.out.println("Top element: " + pq.peek());  // Output: 30
        pq.poll();

        // Peek at the front of the priority queue
        System.out.println("Top element after pop: " + pq.peek());  // Output: 20

        // Check if the priority queue is empty
        System.out.println("Is empty: " + pq.isEmpty());  // Output: False

        // Size of the priority queue
        System.out.println("Size: " + pq.size());  // Output: 3
    }
}
