package myexercise5;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public HashMap<String,Integer> getValues(String str)
    {
        String[] words=str.split("\\ |\\.");
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words)
        {
            Integer n = map.get(w);
            n = (n == null) ? 1 : ++n;
            map.put(w, n);
        }

        return map;
    }
}
