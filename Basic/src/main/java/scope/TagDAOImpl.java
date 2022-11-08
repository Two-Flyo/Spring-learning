package scope;

public class TagDAOImpl implements TagDAO{
    @Override
    public void save(String name) {
        System.out.println("DAO Name:"+name);
    }

    public void init() {
        System.out.println("组件对象初始化");
    }

    public void destory() {

    }
}
