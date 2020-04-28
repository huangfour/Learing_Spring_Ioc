package Mybatis_02.test;

import Mybatis_02.dao.CustomerDao;
import Mybatis_02.pojo.Customer;
import Mybatis_02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-04-21 11:14
 **/
public class MybatisTest {

    public void addCustomerTest() throws Exception {
        // 3.通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        // 4.SqlSession添加 操作
        // 4.1创建Customer对象，并向对象中添加数据
        Customer customer = new Customer();
        customer.setUsername("rose");
        customer.setJobs("student");
        customer.setPhone("18600299968");
        // 4.2执行SqlSession的插入方法，返回的是SQL语句影响的行数
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);
        int rows=customerDao.addCustomer(customer);
        // 4.3通过返回结果判断插入操作是否执行成功
        if (rows > 0) {
            System.out.println("您成功插入了" + rows + "数据");
        } else {
            System.out.println("执行插入操作失败");
        }
        // 4.4提交事务
        sqlSession.commit();
        //新增一条输出id的值。如果没配置keyProperty="id"，则打印出为null
        System.out.println("新增加的id是："+customer.getId());
        // 5.关闭SqlSession
        sqlSession.close();
    }


    public static void findAllCustomer(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerDao customer=sqlSession.getMapper(CustomerDao.class);
        System.out.println(customer.findAllAccount());

    }

    public static void findCustomerByNameAndJobs(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerDao customer=sqlSession.getMapper(CustomerDao.class);
        Customer customer1=new Customer();
        customer1.setUsername("j");
//        customer1.setJobs("doctor");
        System.out.println(customer.findCustomerByNameAndJobs(customer1));

    }

    public static void findCustomerByNameOrJobs(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerDao customer=sqlSession.getMapper(CustomerDao.class);
        Customer customer2=new Customer();
        customer2.setUsername("jack");
        customer2.setJobs("teacher");
        System.out.println(customer.findCustomerByNameOrJobs(customer2));
    }

    public static void updateCustomer() {
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerDao customerDao=sqlSession.getMapper(CustomerDao.class);
        Customer customer3=new Customer();
        customer3.setId(1);
        customer3.setUsername("joy");

        System.out.println(customerDao.updateCustomer(customer3));
        sqlSession.commit();
        sqlSession.close();


    }

    public  static void findAccountsByIds(){
        // 通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        CustomerDao customerDao=sqlSession.getMapper(CustomerDao.class);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(customerDao.findAccountsByIds(list));

    }
    public static void main(String[] args) throws Exception {
//        new MybatisTest().addCustomerTest();
//        SqlSession sqlSession = MybatisUtils.getSession();
//        CustomerDao customerDao=sqlSession.getMapper(CustomerDao.class);
//        //测试MyBatis的一级缓存
//        System.out.println(customerDao.findAccountById(8));
//        System.out.println("第一次执行结束");
//        System.out.println(customerDao.findAccountById(8));
//        System.out.println("第二次执行结束");
        MybatisTest.findCustomerByNameAndJobs();


    }
}
