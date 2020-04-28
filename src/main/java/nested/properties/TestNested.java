package nested.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNested {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("nested-properties.xml");
        Something s = cont.getBean("something", Something.class);
        System.out.println(s.getFred().getBob().getSammy());
    }
}
