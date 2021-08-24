package cn.baizhi.testdao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = YXApplication.class)
@SpringBootTest
public class AdminDao {

    @Autowired
    private AdminDao adminDao;

    @Test
    public void testName(){
        System.out.println(adminDao);


    }

}
