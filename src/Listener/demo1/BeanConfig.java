package Listener.demo1;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:51
 **/
//配置类，在配置类上添加 @ComponentScan 注解。
// 该注解默认会扫描该类所在的包下所有的配置类，
// 相当于之前的 <context:component-scan>。
@ComponentScan
public class BeanConfig {
}
