import java.util.*;

public class Coll1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("A");
        a.add("hello");
        a.add("A");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"m");
    }
}
