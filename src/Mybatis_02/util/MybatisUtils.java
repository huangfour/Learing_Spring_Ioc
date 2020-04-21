package Mybatis_02.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author : hong.Four
 * @date : 2020-04-21 11:13
 **/
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory=null;

    //初始化sqlSessionFactory对象
    static{
        try{
            //使用Mybatis提供的Resources类加载MyBatis的配置文件
            //Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            //用InputStream也可以
            InputStream reader= Resources.getResourceAsStream("mybatis-config.xml");
            //构建sqlSessionFactory工厂
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //获取SqlSession对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}