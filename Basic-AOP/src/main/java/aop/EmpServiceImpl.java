package aop;

public class EmpServiceImpl implements EmpService{
    @Override
    public void save(String name) {
        System.out.println("当前执行的方法名称:save");
        System.out.println("处理业务逻辑,调用save DAO~"+name);
    }

    @Override
    public String find(String name) {
        System.out.println("当前执行方法名称: find");
        System.out.println("处理业务,调用find DAO!!!"+name);
        return null;
    }
}
