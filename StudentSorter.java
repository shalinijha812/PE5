package myexercise5;

import java.util.Comparator;

import static javax.swing.text.html.HTML.Tag.I;

public class StudentSorter implements Comparator<Student4>
{
    public int compare(Student4 stud1,Student4 stud2)

    {
        int result=stud1.getAge()-stud2.getAge();
        if (result==0)
            result=stud1.getName().compareTo(stud2.getName());
        if (result==0)
            result=stud1.getId()-stud2.getId();
        return result;


    }

}
