package Lication.demo1;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:23
 **/
//监听容器启动
@Component
public class LoadProductType implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("监听容器启动-------");
//      可简单的从数据库当中请求数据到缓存当中，实现热启动
    }
}
