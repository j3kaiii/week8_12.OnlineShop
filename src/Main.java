
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write some test code here
        Storehouse s = new Storehouse();
        s.addProduct("milk", 2, 20);
        s.addProduct("coffie", 10, 30);
        s.addProduct("bread", 3, 50);
        
        Shop shop = new Shop(s, reader);
        System.out.print("Your name please: ");
        String customer = reader.nextLine();
        
        shop.manage(customer);
    }
}
