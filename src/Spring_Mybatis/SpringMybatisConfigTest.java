package Spring_Mybatis;


import Spring_Mybatis.mappers.MybatisDao;
import Spring_Mybatis.pojo.account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-04-13 21:44
 **/
public class SpringMybatisConfigTest {

    public void show(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring_Mybatis/spring-mybatis-config.xml");
        for (String s:
                applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }

    public static void findById(){
        ApplicationContext act = new ClassPathXmlApplicationContext("Spring_Mybatis/spring-mybatis-config.xml");
        MybatisDao mybatisDao =  act.getBean(MybatisDao.class);
        account ac = mybatisDao.findById(1);
        System.out.println(ac);

    }

    public static void main(String[] args) {
        SpringMybatisConfigTest.findById();
    }

}
