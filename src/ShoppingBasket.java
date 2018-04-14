
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Evgen
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price) {
        if (!basket.containsKey(product)) {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        } else {
            basket.get(product).increaseAmount();
        }
    }
    
    public int price() {
        int result = 0;
        for (Purchase p : basket.values()) {
            result += p.price();
        }
        return result;
    }
    
    public void print() {
        for (Purchase p : basket.values()) {
            System.out.println(p);
        }
    }
    
}
