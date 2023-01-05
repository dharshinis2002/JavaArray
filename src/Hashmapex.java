

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapex {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("dharshini", 14);
        hm.put("mabi", 02);
        hm.put("asiha", 17);
        hm.put("madhu", 14);

        System.out.println(hm);
        Set s = hm.entrySet();
        System.out.println(s);

        //iteretor
        Iterator i = s.iterator();
        //for each
        while (i.hasNext()) {
           /// System.out.println(i.next());


            //get
              System.out.println(hm.get("dharshini"));
            //contains
              System.out.println(hm.containsKey("madhu"));
            //remove
              System.out.println(hm.remove("asiha"));
            //size
            System.out.println(hm.size());
            //boolean empty
             System.out.println(hm.isEmpty());
            //empty
            //   hm.clear();
            //    System.out.println(hm.isEmpty());
            //iterator
            Object o = i.next();
            Map.Entry e = (Map.Entry) o;
            //  System.out.println(e.getKey());
            //   System.out.println(e.getValue());
            Object birth = e.getValue();
            if (birth.equals(14)) {
                System.out.println(birth);
            }
        }
    }
}