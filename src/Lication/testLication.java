package Lication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-03-01 22:51
 **/
public class testLication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Lication/lication.xml");

        EatEvent xEvent = new EatEvent(true);
//        Way 1：利用context方法进行触发
//        context.publishEvent(xEvent);
//        Way 2：利用context方法进行触发
          EventPublisher.publishEvent(xEvent);
    }
}
