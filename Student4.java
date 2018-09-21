package myexercise5;

public class Student4 {
    private int id;
    private int age;
    private String name;

    public Student4(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    //
    //getter
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    //Setter
    public void setId(int id)
    {
        this.id=id;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
