package Spring_Mybatis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-04-13 21:44
 **/
public class SpringMybatisConfigTest {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring_Mybatis/spring-mybatis-config.xml");
        for (String s:
                applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);

        }
    }

}
