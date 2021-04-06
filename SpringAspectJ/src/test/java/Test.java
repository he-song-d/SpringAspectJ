import com.hbeu.service.BankService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class Test {


    @Autowired
    private BankService bankService;



    @org.junit.Test
    public void test01(){
        //存钱
        bankService.mul("小白",200);
    }
    @org.junit.Test
    public void test02(){
        //存钱
        bankService.save("小白",200);
    }
    @org.junit.Test
    public void test03(){
        //存钱
        bankService.Trans("小白","小花",100);
    }
}
