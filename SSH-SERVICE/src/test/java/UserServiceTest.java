import com.minhthyu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.service.xml")
public class UserServiceTest {
    @Test
    public void checkExist(){
        ClassPathXmlApplicationContext resource =
                new ClassPathXmlApplicationContext("classpath:applicationContext.service.xml");
        UserService userService = (UserService) resource.getBean("userService");
        System.out.println(userService.checkExist("admin"));
        System.out.println(userService.canLogin("admin","admin"));
    }
}
