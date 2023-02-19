import java.util.*;
public class Stack1 {
    public static void main(String args[]) {
        Stack<Integer> list=new Stack<>();
        list.push(1);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println(list);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());

        
    }
    


    


    
}
