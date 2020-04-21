package Mybatis_02.test;

import Mybatis_02.dao.CustomerDao;
import Mybatis_02.pojo.Customer;
import Mybatis_02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

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


    public static void main(String[] args) throws Exception {
        new MybatisTest().addCustomerTest();

    }
}
