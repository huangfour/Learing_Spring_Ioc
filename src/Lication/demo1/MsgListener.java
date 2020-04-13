package Lication.demo1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;

/**
 * @author : hong.Four
 * @date : 2020-04-13 09:02
 **/
public class MsgListener implements SmartApplicationListener {

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return false;
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return false;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("发送一段消息");

    }

    @Override
    public int getOrder() {//定义执行顺序  数字越小越靠前执行
        return 0;
    }
}
