package Extensionpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-02-29 23:59
 **/

public class light implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, MessageSourceAware {

    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String name) {
        System.out.println("当前bean的名字:" + name);
    }

    public void say() {
        System.out.println("hello world");
    }


    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println(classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println(messageSource);
    }
}
