package cdi;

import java.util.Date;

public class EmpDAOImpl implements EmpDAO{
    private String name;
    private Integer age;

    private Date birth;

    public EmpDAOImpl(String name, Integer age, Date birth) {
        this.name = name;
        this.age = age;
        this.birth = birth;
    }

    public EmpDAOImpl() {
    }

    public EmpDAOImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public EmpDAOImpl(String name) {
        this.name = name;
    }


    @Override
    public void save(String name) {
        System.out.println("name="+name);
        System.out.println("this.name="+this.name);
        System.out.println("this.age="+this.age);
        System.out.println("this.birth"+this.birth);
    }
}
