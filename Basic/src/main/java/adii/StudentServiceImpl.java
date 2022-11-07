package adii;

/***
 * 用来测试自动注入
 */
public class StudentServiceImpl implements StudentService{
    @Override
    public void save(String name) {
        System.out.println("Service name:"+name);
    }
}
