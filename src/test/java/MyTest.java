import com.learn.server.ServiceImpl;
import com.learn.server.service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service service = (com.learn.server.service) context.getBean("service");
        service.select();
    }
}
