
package myexercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class MainTest1 {
   Student4 stud1=new Student4(1,20,"Puja");
   Student4 stud2=new Student4(2,20,"Priti");
   Student4 stud3=new Student4(3,22,"Priya");
   Student4 stud4=new Student4(4,20,"Priti");
   Student4 stud5=new Student4(5,18,"Akshita");
   List<Student4> studList=new ArrayList<>();

   public void addObj(List<Student4> studList)
   {
       studList.add(stud1);
       studList.add(stud2);
       studList.add(stud3);
       studList.add(stud4);
       studList.add(stud5);

   }

    public List<Student4> sorter(List<Student4> studList)
    {
        StudentSorter studentSort=new StudentSorter();
        Collections.sort(studList,reverseOrder(studentSort));
        return studList;
    }

//    public List<Student4> run(List<Student4> list)
//    {
//        StudentSorter studentSort = new StudentSorter() ;
//        Collections.sort(list, Collections.reverseOrder(studentSort));
//        return list;
//    }
}
