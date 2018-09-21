package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class AppearanceTest {
    Appearance input;
    String arr[] = {"a","b","b","c","c","d","d"};
    Map<String,Boolean> input1=new HashMap<>();


    @Before
    public void setUp() throws Exception {
        input=new Appearance();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheResult() {

        //Arrange
        Map<String,Boolean> expectedValue=new HashMap<>();
        expectedValue.put("a",false);
        expectedValue.put("b",true);
        expectedValue.put("c",true);
        expectedValue.put("d",true);
        Map<String,Boolean> result=new HashMap<>();

        //act
        result=input.getTheResult(arr);
        //Assert
        assertEquals(expectedValue,result);




    }
}