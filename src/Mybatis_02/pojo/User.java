package Mybatis_02.pojo;

import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-04-30 19:15
 **/
public class User {
    private Integer id;//用户编号
    private String username;//用户姓名
    private String address;//用户地址
    private List<Orders> orderList;//用户关联的订单

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Orders> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Orders> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
