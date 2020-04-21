package Mybatis_02.dao;


import Mybatis_02.pojo.Customer;

/**
 * @author : hong.Four
 * @date : 2020-04-21 10:56
 **/
public interface CustomerDao {

    public Customer findAccountById(Integer id);

    public Integer addCustomer(Customer customer);


}
