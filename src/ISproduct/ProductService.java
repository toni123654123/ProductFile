package ISproduct;
import product.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ISProduct<Product> {
    private static  List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1,"Banh xa phong","VietNam",20000,"Tron truot"));
        products.add(new Product(2,"Banh Ran","VietNam",2000,"Tron"));
        products.add(new Product(3,"Banh Trung","VietNam",5000,"Vuong"));
        products.add(new Product(4,"Banh Chuoi","VietNam",7000,"Dai vang"));
        products.add(new Product(5,"Banh Gao","VietNam",3000,"Tron trang"));
    }
    @Override
    public void add(Product object) {
        boolean flag = true;
        for (int i = 0; i<products.size();i++){
            if (object.getId() == products.get(i).getId()){
                flag= false;
                break;
            }
        }

    }

    @Override
    public void update(Integer id, Product newObject) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Product findByID(Integer id) {
        return null;
    }

    @Override
    public List<Product> findByname(String name) {
        return null;
    }

    @Override
    public List<Product> finAll() {
        return products;
    }
}
