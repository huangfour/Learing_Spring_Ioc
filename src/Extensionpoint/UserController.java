package Extensionpoint;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : hong.Four
 * @date : 2020-02-28 10:13
 **/
public class UserController implements BeanNameAware, InitializingBean , DisposableBean {
    @Autowired
    UserService userService;
    public void say(){
        userService.say();
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("当前bean的名字:"+name);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("属性设置后");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("已经destroy");
    }
}
