package Listener.demo1;

import org.springframework.context.ApplicationEvent;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:27
 **/

public class OrderEvent extends ApplicationEvent {

    public OrderEvent(Object source) {
        super(source);
    }
}
