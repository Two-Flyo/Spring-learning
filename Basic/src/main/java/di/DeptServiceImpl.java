package di;

import init.UserDAO;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DeptServiceImpl implements DeptService{

    //我们业务层需要/依赖DAO对象
    private DeptDAO deptDAO;

    //String类型name
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private Integer age;

    public void setAge(Integer age) {
        this.age = age;
    }

    private boolean sex;

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    private String[] qqs;

    public void setQqs(String[] qqs) {
        this.qqs = qqs;
    }

    private UserDAO[] userDAOS;

    public void setUserDAOS(UserDAO[] userDAOS) {
        this.userDAOS = userDAOS;
    }

    //公开的SET方法
    public void setDeptDAO(DeptDAO deptDAO) {
        this.deptDAO = deptDAO;
    }

    private List<String> habby;

    public void setHabby(List<String> habby) {
        this.habby = habby;
    }

    private List<DeptDAO> deptDAOList;

    public void setDeptDAOList(List<DeptDAO> deptDAOList) {
        this.deptDAOList = deptDAOList;
    }

    private Map<String,String> maps;

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save(String name) {
        System.out.printf("deptService name:"+ name);
        deptDAO.save("啦啦啦");
        System.out.printf("Name: " + this.name);
        System.out.printf("Date"+birth);
        System.out.printf("----------遍历数组----------");
        for (String o:qqs) {
            System.out.println(o);
        }
        System.out.printf("----------遍历对象数组----------");
        for(UserDAO u:userDAOS) {
            System.out.println(u);
        }
        System.out.println("--------------集合遍历-------------");
        habby.forEach(habby-> System.out.println("habby = " + habby));
        deptDAOList.forEach(deptDAOList-> System.out.println("deptDAO = " + deptDAO));
        System.out.println("-------------遍历map----------------");
        maps.forEach((key,value)-> System.out.println("key = " + key +"value: " + value));
        properties.forEach((key,value)-> System.out.println("key="+key + "value:"+value));
    }
}
