package Extensionpoint;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 * @author : hong.Four
 * @date : 2020-03-05 14:43
 * BeanFactoryPostProcessor扩展点,用来扩展beanFactory的功能
 **/

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory:HelloWorld");
    }
}
