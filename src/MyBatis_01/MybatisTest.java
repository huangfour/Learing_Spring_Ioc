package MyBatis_01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author : hong.Four
 * @date : 2020-04-12 20:34
 **/
public class MybatisTest {

    public static void main(String[] args) throws IOException {

        InputStream config = Resources.getResourceAsStream("MyBatis_01/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        SqlSession session=sqlSessionFactory.openSession();
        TestMybatis testMybatis=session.getMapper(TestMybatis.class);
        System.out.println(testMybatis.findById(4).toString());
        System.out.println(testMybatis.findByName("Lu"));
        account ac=new account();
        ac.setId(3);
        ac.setBalance(10000);
        ac.setUsername("Lucy");
        System.out.println(testMybatis.insertAccount(ac)==1 ? "成功" : "失败");
        System.out.println(testMybatis.deleteById(3)==1 ? "成功" : "失败");
        session.commit();


    }
}
