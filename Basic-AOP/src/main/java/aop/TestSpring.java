package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/spring.xml");
        EmpService empService = (EmpService) context.getBean("empService");

        empService.find("LRF!");
    }
}
