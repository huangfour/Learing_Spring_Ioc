package JUC.ThreadLocal;

/**
 * @author : hong.Four
 * @date : 2020-04-17 12:49
 **/
//利用ThreadLocal保存一些业务内容，
// 在线程周期内都通过这个静态ThreadLocal实例的get（）
// 方法取得自己设置过的对象
//    强调是是同一请求内（同一线程内）不同方法间的共享
public class ThreadLocalTest01 {

    public void process() {
        User user = new User("参数");
        UserContextHolder.holder.set(user);
        new Service2().process();

    }

    public static void main(String[] args) {
        new ThreadLocalTest01().process();
    }

}

class Service2 {
    public void process() {

        User user = UserContextHolder.holder.get();
        System.out.println(user.name);
        new Service3().process();

    }

}

class Service3 {
    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println(user.name);

    }


}

class UserContextHolder {
    public static ThreadLocal<User> holder = new ThreadLocal<>();
}

class User {

    String name;
    public User(String name) {
        this.name = name;
    }

}
