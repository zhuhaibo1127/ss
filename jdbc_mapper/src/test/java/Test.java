import com.guigu.myjdbc.entity.UserInfo;
import com.guigu.myjdbc.mapper.UserinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {


    @org.junit.Test
    public  void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserinfoMapper bean = context.getBean(UserinfoMapper.class);
        UserInfo userInfo = bean.selectById(1);
        System.out.println(userInfo);
    }

}
