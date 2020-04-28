package client.service.locator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceTestDrive {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("client-service-locator.xml");
        ClientService clientService = applicationContext.getBean("clientService", ClientServiceImpl.class);
        clientService.sayHi();
    }
}
