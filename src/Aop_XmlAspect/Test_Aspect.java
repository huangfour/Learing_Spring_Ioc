package Aop_XmlAspect;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-03-28 14:52
 **/
public class Test_Aspect {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("Aop_XmlAspect/aopXmlAspect.xml");
        UserService userService= (UserService) applicationContext.getBean("userDao");
        userService.say();
    }
}
