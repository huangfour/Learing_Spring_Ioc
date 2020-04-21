package Transaction;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : hong.Four
 * @date : 2020-04-02 19:30
 **/
public class Transaction {
//    @test.Test
//    public void addAccountTest(){
//        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Transaction/mybatis-config.xml");
//        AccountDao accountDao=applicationContext.getBean("accountDao",AccountDao.class);
//        Account account=new Account();
//        account.setId(1);
//        account.setUsername("Tom");
//        account.setBalance(1000);
//        System.out.println(accountDao.updateAccount(account));
//
//    }
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("Transaction/Transaction_unAnnotation.xml");
        AccountDao accountDao=applicationContext.getBean("accountDao",AccountDao.class);
        accountDao.transfer("Tom","Bob", (double) 100);

    }
}
