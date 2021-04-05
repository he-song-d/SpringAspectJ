import com.hbu.service.BankService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class BankTest {


    @Autowired
    private BankService bankService;



    @Test
    public void test01(){
        //存钱
        bankService.mulit("张三",200);
    }
    @Test
    public void test02(){
        //存钱
        bankService.save("张三",200);
    }
    @Test
    public void test03(){
        //存钱
        bankService.TransMoey("张三","李四",100);
    }
}
