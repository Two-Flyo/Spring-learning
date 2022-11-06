package di;

public class DeptDAOImpl implements DeptDAO{
    @Override
    public void save(String id) {
        System.out.printf("DAO-name=:"+id);
    }
}
