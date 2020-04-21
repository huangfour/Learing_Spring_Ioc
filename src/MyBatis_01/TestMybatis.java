package MyBatis_01;

/**
 * @author : hong.Four
 * @date : 2020-04-12 20:09
 **/
public interface TestMybatis {

    public account findById(Integer id);

    public account findByName(String name);

    public Integer deleteById(Integer id);

    public Integer insertAccount(account account);


}
