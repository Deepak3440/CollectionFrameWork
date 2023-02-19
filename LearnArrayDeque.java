import java.util.*;
public class LearnArrayDeque {
    public static void main(String args[]) 
    {

        // In deque we add and delete both side like
        ArrayDeque<Integer> list=new ArrayDeque<>();
        list.offer(5);
        list.offer(8);
        list.offerFirst(9);
        list.offerLast(8);
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        //as same for peek peek,peekLast,peekFirst

        
    }
    
}
