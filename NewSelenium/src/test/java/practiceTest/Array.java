package practiceTest;

import java.util.*;
import java.util.Map.Entry;

public class Array {

    public static void main(String[] args) {

        Map<Integer,Character> m=new Hashtable();
        int value=2;
       for(char c='a';c<='z';c++)
       {
           m.put(value,c);
           value++;
       }

       System.out.println(m);

       for(Entry o:m.entrySet())
       {
           System.out.println(o.getKey());
           System.out.println(o.getValue());
       }

    }
}
