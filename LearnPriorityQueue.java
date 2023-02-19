import java.util.*;
public class LearnPriorityQueue {
    public static void main(String args[])
    {
        Queue<Integer> list=new PriorityQueue<>();
        list.offer(4);
        list.offer(6);
        list.offer(1);
        list.offer(7);
        System.out.println(list.poll());
        list.poll();
        System.out.println(list);

        // it follow min heap property under so sortest element will be remove from queue
        

    }
    
}
