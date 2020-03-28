package Aop_AnnotationAspect;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author : hong.Four
 * @date : 2020-02-28 10:12
 **/
@Component
public class ServiceImpl implements Service {
    @Override
    public void say() {
        System.out.println("hello word");
    }
}
