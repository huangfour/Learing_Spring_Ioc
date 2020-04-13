package Spring_MyBatis;

import MyBatis.TestMybatis;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-04-13 21:44
 **/
public class SpringMybatisConfigTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring_MyBatis/spring-mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=applicationContext.getBean("sqlSessionFactory",SqlSessionFactory.class);
        SqlSession session=sqlSessionFactory.openSession();
        MyBatis.TestMybatis testMybatis=session.getMapper(TestMybatis.class);
        System.out.println(testMybatis.findById(3).toString());
        session.commit();
    }
}
