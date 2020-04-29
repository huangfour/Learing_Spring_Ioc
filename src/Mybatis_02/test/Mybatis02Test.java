package Mybatis_02.test;

import Mybatis_02.dao.CustomerDao;
import Mybatis_02.dao.PersonDao;
import Mybatis_02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author : hong.Four
 * @date : 2020-04-29 09:39
 **/
public class Mybatis02Test {

    public static void getPersonById(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);
        System.out.println(personDao.getPersonById(2));

    }
    public static void findPersonById(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        PersonDao personDao=sqlSession.getMapper(PersonDao.class);
        System.out.println(personDao.findPersonById(2));

    }

    public static void main(String[] args) {
        Mybatis02Test.findPersonById();

    }
}
