import java.util.*;

public class LearnSet {
    public static void main(String args[]) {
        Set<Integer> list=new HashSet<>();
        //in hashset no duplicacy allowed and no order fixed
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(7);
        System.out.println(list);
        list.remove(7);
        System.out.println(list.contains(5));
        //  list.clear()


        // As same LinkedHashSet only order is fixed jo phele ayega wo list mai add hoga
        // in TreeSet it follow bst property order is fixed and arrange in sorted order

    
        Set<Integer> list1=new LinkedHashSet<>();
        //in also no duplicacy allowed and no order fixed
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(7);
        System.out.println(list1);
        list1.remove(7);
        System.out.println(list.contains(5));

        Set<Integer> list2=new TreeSet<>();
        //her also no duplicacy allowed and no order fixed
        list2.add(3);
        list2.add(5);
        list2.add(8);
        list2.add(7);
        list2.add(1);
        System.out.println(list2);
        list2.remove(7);
        System.out.println(list2.contains(5));

        
    }

    
}
