
import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist_vs_arraylist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arraylist = new ArrayList<>();

        long elapsedtime;
        long endTime;
        long startTime;

        for(int i=0;i<100000;i++){
            linkedlist.add(i);
            arraylist.add(i);
        }

        //--------LInked List-----------
        startTime = System.nanoTime();

        //linkedlist.get(1000);
        linkedlist.remove(99999);
        endTime = System.nanoTime();

        elapsedtime = endTime-startTime;
        System.out.println("lINKED LIST : "+elapsedtime);
        //------------------------------

        //--------Array List-----------
        startTime = System.nanoTime();

        //arraylist.get(1000);
        arraylist.remove(99999);

        endTime = System.nanoTime();


        elapsedtime = endTime-startTime;
        System.out.println("Array list : "+elapsedtime);
        //------------------------------
    }
}
