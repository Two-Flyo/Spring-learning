package com.lrf.test.test;

import com.lrf.dao.DeptDAO;
import com.lrf.service.DeptService;
import com.lrf.service.DeptServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/lrf/spring.xml");
        DeptService deptService = (DeptService) context.getBean("deptService");
        System.out.println(deptService.getClass());
        deptService.save("xxxx");
    }
}
