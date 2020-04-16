package Listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-03-04 23:23
 **/
@Component
public class EventPublisher implements ApplicationEventPublisherAware {

    private static ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        EventPublisher.applicationEventPublisher = applicationEventPublisher;
    }

    public static void  publishEvent(ApplicationEvent communityArticleEvent) {
        applicationEventPublisher.publishEvent(communityArticleEvent);
    }
}
