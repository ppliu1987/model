import com.menis.controller.TestController;
import com.menis.service.IMenisUserService;
import com.menis.service.ITestService;
import com.menis.util.RedisUtil;
import com.menis.vo.UserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/springmvc.xml",
        "file:src/main/webapp/WEB-INF/spring/spring_mybatis.xml",
        "file:src/main/webapp/WEB-INF/spring/spring_redis.xml"})
public class TestApp {
    @Autowired
    TestController controller;
    @Autowired
    ITestService testService;
    @Autowired
    IMenisUserService userService;
    @Autowired
    RedisUtil redisUtil;

    @Test
    public void testRedis(){
        System.out.println("是否有"+redisUtil.hasKey("name"));

    }

    @Test
    public void testUserService(){
        UserVo user = userService.getUserByMblNo("13311011971");
        System.out.println(user.toString());
    }

    @Test
    public void testController(){//测试
        String ret = controller.serviceMethod("ppliu");
        System.out.println(ret);
    }

    @Test
    public void testService(){
        String name = "ppliu";
        String ret = testService.serviceMethod(name);
        System.out.println(ret);
    }

    @Test
    public void testVo(){
        UserVo user = new UserVo();
        user.setBankCardNo("2002000119876542093");
        user.setMblNo("13311011971");
        user.setPasswd("777777");
        user.setIdCard("130923198707052613");
        userService.update(user);
    }

}