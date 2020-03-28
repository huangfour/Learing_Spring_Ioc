package Extensionpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-03-01 00:26
 * BeanPostProcessor应用在bean被初始化前,且每一个bean在初始化前都会被执行一次
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【bean初始化之前，bean is:"+bean.toString()+"  beanName is:"+ beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【bean初始化之后，bean is:"+bean.toString()+"  beanName is:"+ beanName);

        return bean;
    }
}
//接口的两个方法都不能返回null，因为后置处理器从Spring IOC容器中获取Bean实例对象没有再次放回到IOC容器中，后续操作获取Bean对象可能会空指针异常！
