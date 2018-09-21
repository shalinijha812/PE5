package myexercise5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Appearance {
    public HashMap<String,Boolean> getTheResult(String[] str)
    {
        int count=0;boolean b;String temp;
        HashMap<String, Boolean> map = new HashMap<>();
        Set<String> uniqueElementsOfStr=new HashSet<>();

        for(int i=0;i<str.length;i++)
        {
            uniqueElementsOfStr.add(str[i]);
        }
        Iterator iterator = uniqueElementsOfStr.iterator();
        while(iterator.hasNext())
        {
         temp = (String)iterator.next();
         for(int i=0;i<str.length;i++)
            {
                 if (temp.equals(str[i]))
                     count=count+1;
            }
            if (count>=2)
            {
                map.put(temp,true);
            }
            else
            {
                map.put(temp,false);
            }
            count=0;
        }

        return map;
    }
}
