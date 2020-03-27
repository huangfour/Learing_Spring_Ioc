package Bean;

/**
 * @author : hong.Four
 * @date : 2020-03-17 10:31
 **/
//设值注入
public class User1 {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User1{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
