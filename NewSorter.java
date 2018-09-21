package myexercise5;

import java.util.*;

public class NewSorter {
    public List<String> sort(String[] str)
    {
        List<String> list=new ArrayList<String>();
        TreeSet<String> values=new TreeSet<>();
        for(int i=0;i<str.length;i++)
        {
            values.add(str[i]);
        }
        int size1=str.length;
        for(String string:values)
            list.add(string);
        return list;
    }

}
