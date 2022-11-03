package init;

public class TestUserDAO {
    public static void main(String[] args) {
        //原来创建组件对象
        UserDAOImpl userDAO = new UserDAOImpl();
        //使用组件对象
        userDAO.save("lrf");
        //销毁
        //JVM虚拟机

    }
}
