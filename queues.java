
import java.util.*;

public class queues {
    public static void main(String[] args) {
        
        //Queues data structure in java
        Queue<String> queue = new LinkedList<>();

        queue.offer("Abhishek");
        queue.offer("Gaurav");
        queue.offer("Yash");
        queue.offer("Onkar");
        System.out.println(queue);
        System.out.println("The size of the queue is :"+queue.size());
        
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());

    //these functions are from the collections class because the Queue data structure in java is a child of collections class
        System.out.println(queue.isEmpty());

        System.out.println("The size of the queue is :"+queue.size());
        System.out.println(queue.contains("Yash"));
    }
    
}
