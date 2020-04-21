package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_con {
    //把用户名、密码、URL、驱动类 这几个字符串定义为常量
    private static final String USER = "root";
    private static final String PWD = "123456";
    private static final String URL = "jdbc:mysql://localhost/spring?useSSL=false";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        System.out.println("JDBC驱动加载成功");
        //得到数据库的连接
        Connection connection = DriverManager.getConnection(URL, USER, PWD);
        System.out.println("数据库连接成功");
    }
   
}
