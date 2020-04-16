package Listener.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:31
 **/
public class ApplicationEventTests {


    public static void main(String[] args) {
//      使用AnnotationConfigApplicationContext可以实现基于Java的配置类加载Spring的应用上下文。避免使用application.xml进行配置。相比XML配置，更加便捷。
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(BeanConfig.class);
        context.refresh();
        OrderService orderService=(OrderService)context.getBean("orderService");
        orderService.saveOrder();
    }
}
