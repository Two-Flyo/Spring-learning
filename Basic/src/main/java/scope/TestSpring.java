package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scope/spring.xml");
        TagDAO tagDAO = (TagDAO) context.getBean("tagDAO");
        tagDAO.save("");

    }
}
