import config.springConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.AccountService;
import sun.security.krb5.Config;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = springConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService as;

    @Test
    public void test(){
        as.save();
    }

    public static void main(String[] args) {
       //AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(springConfig.class);
 //       ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
       // AccountService as = ac.getBean("accountService", AccountService.class);
        //as.save();
    }
}
