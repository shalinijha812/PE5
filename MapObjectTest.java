package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapObjectTest {
    MapObject input;

    @Before
    public void setUp() throws Exception {
        input=new MapObject();;
    }


    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheInterchange() {
        Map<String,String> result=new HashMap<>();
        Map<String,String> map=new HashMap<>();
        map.put("val1","c++");
        map.put("val2","java");
        //Arrange
        Map<String,String> expectedMap=new HashMap<>();
        expectedMap.put("val1"," ");
        expectedMap.put("val2","c++");
        //Act
        result=input.getTheInterchange(map);
        //Assert
        assertEquals(expectedMap,result);

    }
}