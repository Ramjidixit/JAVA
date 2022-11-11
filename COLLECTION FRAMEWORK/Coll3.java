//inserting name in list and printing it in reverse order 

import java.util.*;
public class Coll3 {
    public static void main(String[] args) {
        ArrayList <String> a=new ArrayList <String> ();
        a.add("Raj");
        a.add("Mohan");
        a.add("radhey");
        a.add("John");
        a.add("Raju");
        for (String name : a) {
            System.out.println(name);
        }
        System.out.println(a.size());
        int b=a.size();
        for(int i=b-1;i>=0;i--){
            System.out.println(a.get(i));
        }
    }
}
