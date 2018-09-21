package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NewSorterTest {
    NewSorter input;


    @Before
    public void setUp() throws Exception {
        input=new NewSorter();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void sort() {
        String[] str={"Harry","Olive","Alice","Bluto","Eugene"};
        //Arrange
        List<String> expectedValue=new ArrayList<String>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive"));
        //Act
        List<String> result=input.sort(str);
        //Assert
        assertEquals(expectedValue,result);

    }
}