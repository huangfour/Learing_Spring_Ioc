package Extensionpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Controller;


/**
 * @author : hong.Four
 * @date : 2020-02-29 23:59
 * bean的Aware扩展点
 **/
@Controller
public class light implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, MessageSourceAware {


    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Aware\nsetBeanClassLoader:HelloWorld");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:HelloWorld");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName:HelloWorld");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("setMessageSource:HelloWorld");

    }
}
