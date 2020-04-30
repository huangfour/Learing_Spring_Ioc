package Mybatis_02.test;

import Mybatis_02.dao.CustomerDao;
import Mybatis_02.dao.PersonDao;
import Mybatis_02.dao.UserDao;
import Mybatis_02.pojo.Person;
import Mybatis_02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.time.Period;

/**
 * @author : hong.Four
 * @date : 2020-04-29 09:39
 * 级联测试
 **/
public class Mybatis02Test {

    public static void getPersonById(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);
        Person person=personDao.getPersonById(1);
//        System.out.println(person.getCard());

    }
    public static void findPersonById(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);
        System.out.println(personDao.findPersonById(2));

    }

    public static void fingUserWithOrders(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.fingUserWithOrders(1));


    }


    public static void main(String[] args) {
        Mybatis02Test.fingUserWithOrders();

    }
}
