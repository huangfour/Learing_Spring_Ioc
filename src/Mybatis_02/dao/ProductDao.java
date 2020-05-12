package Mybatis_02.dao;

import Mybatis_02.pojo.Product;

/**
 * @author : hong.Four
 * @date : 2020-05-06 08:55
 **/
public interface ProductDao {
    public Product findProductById(Integer id);
}
