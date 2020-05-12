package Mybatis_02.dao;

import Mybatis_02.pojo.Orders;
import Mybatis_02.pojo.Product;

import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-05-01 18:54
 **/
public interface OrdersDao {

    public List<Orders> findOrdersById(Integer id);

    public List<Product> findOrdersWithProduct(Integer id);

}
