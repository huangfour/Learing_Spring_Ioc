package Jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author : hong.Four
 * @date : 2020-04-01 18:15
 **/
public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Jdbc/Jdbc.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println("JdbcTemplate测试");
        System.out.println( jdbcTemplate.queryForList("SELECT * FROM `items` where root_cat_id='2'"));
    }

}
