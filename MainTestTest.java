package myexercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest1 input;

    @Before
    public void setUp() throws Exception {
        input=new MainTest1();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void sort(){
        List<Student4> list=new ArrayList<Student4>();;

        Student4 stud1=new Student4(1,20,"Puja");
        Student4 stud2=new Student4(2,20,"Priti");
        Student4 stud3=new Student4(3,22,"Priya");
        Student4 stud4=new Student4(4,20,"Priti");
        Student4 stud5=new Student4(5,18,"Akshita");

        //Arrange
        List<Student4> expectedList=new ArrayList<>();
        expectedList.add(stud2);
        expectedList.add(stud4);
        expectedList.add(stud3);
        expectedList.add(stud1);
        expectedList.add(stud5);
        //Act
        List<Student4> result=input.sorter(list);
        //Assert
        assertEquals(list,result);



    }
}