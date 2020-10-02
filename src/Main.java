
import product.Product;
import xuly.XuLy;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void disPlay(List<Product> list){
        Iterator iterator = list.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
       XuLy.Output();
        disPlay(XuLy.Input());

    }

}
