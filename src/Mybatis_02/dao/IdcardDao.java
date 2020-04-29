package Mybatis_02.dao;

import Mybatis_02.pojo.IdCard;

/**
 * @author : hong.Four
 * @date : 2020-04-29 09:10
 **/
public interface IdcardDao {
    public IdCard findCodeById(Integer id);
}
