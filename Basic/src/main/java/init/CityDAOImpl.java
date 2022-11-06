package init;

public class CityDAOImpl implements CityDAO{
    @Override
    public void delete(String id) {
        System.out.printf("删除的id是:"+ id);
    }
}
