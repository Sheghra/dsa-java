import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Is the stack empty : "+stack.isEmpty());

        stack.push("Abhishek");
        stack.push("Santosh");
        stack.push("Omkar");
        System.out.println("Stack before deleting : "+stack);
        String a =stack.pop();
        System.out.println(stack);
        System.out.println("The deleted element is : "+a);
        System.out.println("Is the stack empty : "+stack.isEmpty());

    }
}
