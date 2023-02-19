import java.util.ArrayList;
public class LearnArrayList
{
    public static void main(String args[])
    {


        // as same LinkedList through list interface
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        System.out.println(list);
        // to add between list
        list.add(1,40);
        System.out.println(list);
        //to acces list item by index

    System.out.println(list.get(1));
    // to remove element
    list.remove(1);
    System.out.println(list);
    list.remove(Integer.valueOf(5));
    System.out.println(list);
    //list.clear();
    //to replace given index
    list.set(1,30);
    System.out.println(list);
    list.add(70);
    list.add(49);
    // to acces one one by
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }


    //through for each loop
    System.out.println();

    for(Integer ans:list)
    {
        System.out.println(ans);
    }

    


    





    }
}