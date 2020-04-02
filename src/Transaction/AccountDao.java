package Transaction;

/**
 * @author : hong.Four
 * @date : 2020-04-02 19:16
 **/
public interface AccountDao {
    public Integer addAccount(Account account);
    public Integer updateAccount(Account account);
    public Integer deleteAccount(Integer id);
    public void transfer(String outUser,String inUser,Double money);
}
