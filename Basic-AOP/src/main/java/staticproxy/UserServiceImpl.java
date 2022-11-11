package staticproxy;


//原始业务逻辑对象
public class UserServiceImpl implements UserService{

    //开启事务 处理业务 调用
    @Override
    public void save(String name) {
            System.out.println("处理业务逻辑,调用saveDAO");
    }

    @Override
    public void delete(String id) {
        System.out.println("处理业务逻辑,调用DAO");
    }

    @Override
    public void update() {
        try {
            System.out.println("处理业务逻辑,调用DAO~~~");
        }catch (Exception e){
            System.out.println("回滚事务");
            e.printStackTrace();
        }
    }

    @Override
    public String findAll(String name) {
        System.out.println("处理业务逻辑,调用findallDAO~~~");
        return name;
    }

    @Override
    public String findOne(String id) {
            System.out.println("处理业务逻辑,调用DAO~~~");
        return id;
    }

}
