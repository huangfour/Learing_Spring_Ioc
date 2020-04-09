package Transaction;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : hong.Four
 * @date : 2020-04-02 19:18
 **/
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer addAccount(Account account) {
        String sql="insert into account(username, balance) values(?,?)";
        Object[] objects=new Object[]{account.getUsername(),account.getBalance()};
        Integer num=jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public Integer updateAccount(Account account) {
        String sql="update account set username=?,balance=? where id=?";
        Object[] objects=new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()};
        Integer num=jdbcTemplate.update(sql,objects);
        return num;
    }

    @Override
    public Integer deleteAccount(Integer id) {
        String sql ="delete form account where id=?";
        Integer num=jdbcTemplate.update(sql,id);
        return num;
    }

    @Override
//    @Transactional(propagation = Propagation.REQUIRED)
    public void transfer(String outUser, String inUser, Double money) {
        jdbcTemplate.update("update account set balance =balance +? "+"where username= ?",money,inUser);
        int i=1/0;
        jdbcTemplate.update("update account set balance =balance -?"+"where username= ?",money,outUser);

    }
}
