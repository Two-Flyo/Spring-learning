package adi;

public class StudentDAONewImpl implements StudentDAO{
    @Override
    public void save(String name) {
        System.out.println("NewDAOName:"+name);
    }
}
