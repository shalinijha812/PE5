package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MyHashMapTest {
    MyHashMap input;

    @Before
    public void setUp() throws Exception {
        input=new MyHashMap();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getValues() {

        Map<String,Integer> expectedValue=new HashMap<>();
        Map<String,Integer> result=new HashMap<>();
        expectedValue.put("one",1);
        expectedValue.put("two",2);
        expectedValue.put("three",4);
        //Act
         result=input.getValues("one two two three three three.three");
        //Assert
        assertEquals(expectedValue,result);
    }
}