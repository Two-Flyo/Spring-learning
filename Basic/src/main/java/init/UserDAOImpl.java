package init;

public class UserDAOImpl implements UserDAO{
    @Override
    public void save(String name) {
        System.out.printf("name = " + name);
    }
}
