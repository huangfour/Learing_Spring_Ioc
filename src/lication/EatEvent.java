package lication;

import org.springframework.context.ApplicationEvent;

/**
 * @author : hong.Four
 * @date : 2020-03-04 20:41
 * 事件
 **/
public class EatEvent extends ApplicationEvent {

    private boolean source;
    public EatEvent(boolean source) {
        super(source);
        this.source = source;
    }
    public void say() {
        System.out.println("事件源被触发");
    }
}
