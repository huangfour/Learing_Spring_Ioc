package Mybatis_02.pojo;

import java.util.List;

/**
 * @author : hong.Four
 * @date : 2020-04-30 19:14
 **/
public class Orders {

    private Integer id;//订单号
    private String number;//订单编号
    private List<Product> productlist;

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

    public List<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(List<Product> productlist) {
        this.productlist = productlist;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", productlist=" + productlist +
                '}';
    }
}
