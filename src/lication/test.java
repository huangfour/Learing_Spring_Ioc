package lication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-03-01 22:51
 **/
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        EatEvent xEvent = new EatEvent(true);
//        context.publishEvent(xEvent);
        EventPublisher.publishEvent(xEvent);
    }
}
