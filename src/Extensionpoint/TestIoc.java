package Extensionpoint;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-02-26 23:13
 * 查看IOC容器当中存在的所有bean
 **/
public class TestIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBeanDefinitionCount() + "个Bean对象");
        for (String s : applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }



    }
}
