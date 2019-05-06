import com.minhthyu.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.dao.xml")

public class UserDaoImplTest {

    @Test
    public void saveTest() {
        System.out.println("==================");
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("classpath*:applicationContext.dao.xml");
        UserDao userDao = (UserDao) resource.getBean("userDao");
//        User user = new User();
//        user.setuId("666666");
//        user.setuPassword("123456");
//        user.setuStatus(0);
//        user.setuLoginTime(new Date());
//        userDao.insertUser(user);
//        System.out.println(userDao.selectUser("admin"));
    }

}
