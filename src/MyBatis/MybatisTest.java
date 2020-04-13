package MyBatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
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

        InputStream config = Resources.getResourceAsStream("MyBatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        SqlSession session=sqlSessionFactory.openSession();
        TestMybatis testMybatis=session.getMapper(TestMybatis.class);
        System.out.println(testMybatis.findById(3).toString());
        session.commit();


    }
}
