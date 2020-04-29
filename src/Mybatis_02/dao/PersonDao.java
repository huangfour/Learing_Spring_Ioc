package Mybatis_02.dao;

import Mybatis_02.pojo.Person;

import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-04-29 09:10
 **/
public interface PersonDao {

    public Person getPersonById(Integer id);

    public Person findPersonById(Integer id);

}
