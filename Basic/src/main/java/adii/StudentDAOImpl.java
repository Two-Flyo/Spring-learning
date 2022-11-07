package adii;

public class StudentDAOImpl implements StudentDAO{
    @Override
    public void save(String name) {
        System.out.println("student name"+name);
    }
}
