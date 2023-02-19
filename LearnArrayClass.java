import java.util.*;
public class LearnArrayClass {
    public static void main(String args[]) {
        int [] list={1,2,3,4,5,6,7,8,88,888};
        int idx=Arrays.binarySearch(list,6);
        System.out.println("elemebnt found "+ idx);
        // for sorting
        int [] list1={1,20,90,4,5,6,7,8,88,888};
        Arrays.sort(list1);
        for(int i:list1)
        {
        System.out.println(i);
        }
        Arrays.fill(list1,0);
        for(int i:list1)
        {
        System.out.println(i);
        }

        


        
    }
    
}
