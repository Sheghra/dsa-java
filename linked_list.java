import java.util.LinkedList;
public class linked_list {
    public static void main(String[] args) {
        
        LinkedList<String> name = new LinkedList<>();
        System.out.println(name);
        
        /*  This is the implementation of LinkedList as Stack
        name.push("Abhishek");
        name.push("Toppo");
        name.push("Gaurav");
        name.push("Thakur");
        System.out.println(name);
        name.pop();
        name.pop();
        System.out.println(name); 
        */

        //Queue implementation of Linked list
        name.offer("Abhishek");
        name.offer("Toppo");
        name.offer("Gaurav");
        name.offer("Thakur");
        System.out.println(name);
        name.poll();
        name.poll();
        System.out.println(name); 
        name.addFirst("Onkar");
        name.addFirst("Upare");

        name.addLast("Money");
        name.addLast("Gone");
        name.poll();
        name.poll();

        System.out.println("the index of Gaurav is : "+name.indexOf("Gaurav"));
        System.out.println(name); 
        System.err.println("\n");
        System.out.println(name.peekFirst());
        System.out.println(name.peekLast());
    }
}
