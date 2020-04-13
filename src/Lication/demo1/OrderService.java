package Lication.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author : hong.Four
 * @date : 2020-04-13 08:18
 **/
@Component
public class OrderService {

    @Autowired
    ApplicationContext applicationContext;

    public void saveOrder() {
        System.out.println("订单创建成功");
        applicationContext.publishEvent(new OrderEvent(25));

    }
}
