package Spring_Mybatis.mappers;


import Spring_Mybatis.pojo.account;


/**
 * @author : hong.Four
 * @date : 2020-04-12 20:09
 **/

public interface MybatisDao {

    public account findById(Integer id);

}
