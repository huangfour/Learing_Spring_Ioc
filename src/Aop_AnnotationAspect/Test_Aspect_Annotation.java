package Aop_AnnotationAspect;

import Aop_XmlAspect.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-03-28 16:50
 **/
public class Test_Aspect_Annotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("Aop_AnnotationAspect/aopAnnotationAspect.xml");
        Service userService = (Service) applicationContext.getBean("serviceImpl");
        userService.say();
    }
}
