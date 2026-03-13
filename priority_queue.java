import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    public static void main(String[] args) {
         
        Queue<String> pq = new PriorityQueue<>();

        pq.offer("Santosh");
        pq.offer("Yash");
        pq.offer("Abhishek");
        pq.offer("Gaurav");
        pq.offer("Onkar");

        System.out.println(pq);
        
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }
    }
    
}
