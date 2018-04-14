
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author j3kaiii
 */
public class Storehouse {
    
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<String, Integer>();
        stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (stocks.containsKey(product)) {
            return stocks.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            int s = stocks.get(product);
            if (s > 0) {
                s--;
                stocks.put(product, s);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<String>();
        for (String s : stocks.keySet()) {
            products.add(s);
        }
        return products;
    }
}
