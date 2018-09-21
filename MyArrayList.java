package myexercise5;

import java.util.List;

public class MyArrayList {

    public List<String> upadateMyList(String data1,String data2, List<String> myArray)
    {
        myArray.set(0,data1);
        myArray.set(2,data2);

        return myArray;

    }
    public boolean emptyMyList(List<String> myArray)
    {
        myArray.removeAll(myArray);
        if(myArray.isEmpty())

            return true;
        else

            return false;
    }

}
