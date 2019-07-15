import com.menis.service.IMenisUserService;
import com.menis.vo.UserVo;
import com.menis.controller.TestController;
import com.menis.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:springmvc.xml"})
public class TestApp {
    @Autowired
    TestController controller;
    @Autowired
    ITestService testService;
    @Autowired
    IMenisUserService userService;

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

}