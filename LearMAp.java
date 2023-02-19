import java.util.*;
public class LearMAp {
    public static void main(String args[]) {
        //it does not allow duplicate key if we want ti put then it will over write original value

Map<String,Integer> list=new HashMap<>();
list.put("Delhi",1);
list.put("Mumbai",2);
list.put("Noida",3);
list.put("Banglore",4);
System.out.println(list);
System.out.println(list.remove("Delhi"));
System.out.println(list.containsKey("Delhi"));


//iteration
for(Map.Entry<String,Integer> e:list.entrySet())
{
    System.out.println(e);
}
// iterate on keyset
for(String key:list.keySet())
{
    System.out.println(key);
}
// iterate on value
for(Integer ans:list.values())
{
    System.out.println(ans);
}

//same TreeMap but it give sorted form on the basis of Key it implement bst
        
}
    
}
