package di;

public class DeptServiceImpl implements DeptService{

    //我们业务层需要/依赖DAO对象
    private DeptDAO deptDAO;
    //公开的SET方法
    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    @Override
    public void save(String name) {
        System.out.printf("deptService name:"+ name);
        deptDAO.save("啦啦啦");
    }
}
