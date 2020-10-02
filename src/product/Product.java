package product;

import java.io.Serializable;
public class Product implements Serializable {
    private Integer id;
    private String name;
    private String hangsanxuat;
    private Integer gia;
    private String mota;

    public Product(){

    }

    public Product(Integer id, String name, String hangsanxuat, Integer gia, String mota) {
        this.id = id;
        this.name = name;
        this.hangsanxuat = hangsanxuat;
        this.gia = gia;
        this.mota = mota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(String hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangsanxuat='" + hangsanxuat + '\'' +
                ", gia=" + gia +
                ", mota='" + mota + '\'' +
                '}';
    }
}
