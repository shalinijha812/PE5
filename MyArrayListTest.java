package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MyArrayListTest {
    MyArrayList input;
    @Before
    public void setUp() throws Exception {
        input=new MyArrayList();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void upadateMyList() {
        ArrayList<String> myList=new ArrayList<>();
        myList.add("Apple");
        myList.add("Grape");
        myList.add("Melon");
        myList.add("Berry");
        //Arrange
        List<String> expectedValue=new ArrayList<String>(Arrays.asList("Kiwi","Grape","Mango","Berry"));
        //Act
        List<String> result=input.upadateMyList("Kiwi","Mango",myList);
        //Assert
        assertEquals(expectedValue,result);
    }

    @Test
    public void emptyMyList() {
        ArrayList<String> myList=new ArrayList<>();
        myList.add("Apple");
        myList.add("Grape");
        myList.add("Melon");
        myList.add("Berry");
        //Arrange
        boolean expectedValue=true;
        //Act
        boolean result=input.emptyMyList(myList);
    }
}