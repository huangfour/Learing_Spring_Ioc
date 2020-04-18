import Bean.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Executor;

/**
 * @author : hong.Four
 * @date : 2020-03-27 22:46
 **/
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean bean=(Bean) applicationContext.getBean("bean");
        System.out.println(bean);
//        JUC.Executor executor=new
    }
}
