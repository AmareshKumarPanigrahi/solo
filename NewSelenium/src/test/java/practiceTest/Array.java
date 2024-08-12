package practiceTest;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Array {

    public static void main(String[] args) {


        Map<String,Integer> m=new Hashtable();
        m.put("name",1);
        m.put("son",2);

//        for(Set<Map.Entry<String,Integer>> o :m.entrySet())
//        {
//            System.out.println(o.getKey());
//        }

//        System.out.println(m.entrySet());

        LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<>();
        int value=2;
        for(char c='a';c<='z';c++)
        {
            lhm.put(c,value);
            value+=2;
        }


        for(Map.Entry<Character,Integer> r :lhm.entrySet())
        {
            System.out.println(r.getValue());
        }



    }
}
