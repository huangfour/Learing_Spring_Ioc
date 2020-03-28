package lication;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-03-04 20:29
 **/
@Component
public class EatEventListener implements ApplicationListener<EatEvent> {

     @Override
     public void onApplicationEvent(EatEvent testEvent) {
         testEvent.say();
         System.out.println(".......监听器1被触发.......");
         System.out.print("事件源接收到的参数为:"+testEvent.getSource()+"\n");

     }
}