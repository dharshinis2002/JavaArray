import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class EntrySet {
    public static void main(String[] args) {
        HashMap map =new HashMap();
        map.put("mango",30);
        map.put("apple",50);
        map.put("orange",30);

        Set s=map.entrySet();
        System.out.println(s);
        Collection c=map.values();
        System.out.println(c);


    }
}
