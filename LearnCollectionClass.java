import java.util.*;
import java.util.Collections;
public class LearnCollectionClass {
    public static void main(String args[]) 
        {
            List<Integer> list=new ArrayList<>();
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(8);
            list.add(8);
            System.out.println("The minimum element is " + Collections.min(list));
            System.out.println("The minimum element is " + Collections.max(list));
            
            System.out.println("The minimum element is " + Collections.frequency(list,8));
            Collections.sort(list);
            System.out.println(list);
        
    }
    
}
