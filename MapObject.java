package myexercise5;


import java.util.HashMap;
import java.util.Map;

public class MapObject {
    public Map<String,String> getTheInterchange(Map<String,String> map)
    {
        String value2=map.get("val1");
        map.replace("val2",value2);
        map.replace("val1"," ");
        return map;

    }
}
