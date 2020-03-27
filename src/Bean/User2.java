package Bean;

/**
 * @author : hong.Four
 * @date : 2020-03-17 10:33
 **/
//构造方法注入
public class User2 {

    private String username;
    private String password;

    public User2(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
