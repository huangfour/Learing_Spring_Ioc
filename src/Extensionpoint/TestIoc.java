package Extensionpoint;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-02-26 23:13
 **/
public class TestIoc {
    public static void main(String[] args){
//        AnnotationConfigApplicationContext ap=new AnnotationConfigApplicationContext();
        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBeanDefinitionCount()+"个Bean对象");
        for (String s: applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }


    }
}
