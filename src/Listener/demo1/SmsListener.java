package Listener.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:28
 **/
@Component
public class SmsListener implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("执行发送短信逻辑代码");
    }
}
