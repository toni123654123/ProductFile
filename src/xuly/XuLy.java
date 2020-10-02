package xuly;

import ISproduct.ProductService;
import product.Product;

import java.io.*;
import java.util.List;

public class XuLy {
    public static void Output(){
        ProductService productService = new ProductService();
        List<Product> products;
        products=productService.finAll();
        File file = new File("Product7.dat");
        try {
            if (!file.exists()){
                if (file.createNewFile()){
                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oss = new ObjectOutputStream(fos);
                    oss.writeObject(products);
                    oss.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Product> Input(){
        List<Product> products = null;
        try {
            FileInputStream fip = new FileInputStream("Product7.dat");
            ObjectInputStream oip = new ObjectInputStream(fip);
            products = (List<Product>) oip.readObject();
            oip.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products ;
    }
}
