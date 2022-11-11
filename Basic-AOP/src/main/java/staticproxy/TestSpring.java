package staticproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.activation.ActivationMonitor;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("staticproxy/spring.xml");
        UserService userService = (UserService) context.getBean("userServiceStaticProxy");
        userService.findAll("lrf");
    }
}
