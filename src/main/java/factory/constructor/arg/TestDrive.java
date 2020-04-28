package factory.constructor.arg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDrive {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory-constructor-arg.xml");
        IndexApp indexApp = applicationContext.getBean("indexApp", IndexApp.class);
        System.out.println(indexApp.serve());
    }
}
