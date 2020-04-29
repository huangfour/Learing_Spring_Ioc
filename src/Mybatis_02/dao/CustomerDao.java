package Mybatis_02.dao;


import Mybatis_02.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-04-21 10:56
 **/
public interface CustomerDao {

    public Customer findAccountById(Integer id);

    public Integer addCustomer(Customer customer);

    public Customer findAllAccount();

    public List<Customer> findCustomerByNameAndJobs(Customer customer);

    public List<Customer> findCustomerByNameOrJobs(Customer customer);

    public Integer updateCustomer(Customer customer);

    public List<Customer> findAccountsByIds(List ids);


}
