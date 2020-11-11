import com.ahpu.dao.saleDao;
import com.ahpu.pojo.sale;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class test extends BaseJunit4Test{
    @Test
    public void test1(){
        sale s=new sale();
        System.out.println(s.toString());
    }

    @Autowired
    private saleDao saledao;
    @Test
    public void test2(){
        System.out.print(1);
        List<sale> result = saledao.allSale(1);
        System.out.print(result);
    }
}
