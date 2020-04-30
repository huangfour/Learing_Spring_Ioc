package Mybatis_02.pojo;

/**
 * @author : hong.Four
 * @date : 2020-04-30 19:14
 **/
public class Orders {

    private Integer id;//订单号
    private String number;//订单编号

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
