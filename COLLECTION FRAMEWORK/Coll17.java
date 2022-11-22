//LinkedHashSet

import java.util.*;

public class Coll17 {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add("Ram");
        h.add("Shreya");
        h.add("Rinku");
        h.add("Ram");
        h.add(null);
        h.add(10);
        h.add(20);
        System.out.println(h);
    }

}
// [Ram, Shreya, Rinku, null, 10, 20]
