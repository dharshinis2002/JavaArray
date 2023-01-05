       import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Entryex {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("tamil", 90);
        hm.put("eng", 90);
        hm.put("maths", 100);

        System.out.println("original list" + hm);

        Set s = hm.entrySet();
        System.out.println(s);

        Iterator i = s.iterator();
        while (i.hasNext()) {
            //System.out.println(i.next());
            Object o = i.next();
            Map.Entry e = (Map.Entry) o;
           // System.out.println(e.getValue());

           /// System.out.println(e.getKey());
            Object Sub = e.getKey();
             Object mark = e.getValue();

            if (mark.equals(90))
                System.out.println(Sub);
                // System.out.println(mark);

            }
        }

    }