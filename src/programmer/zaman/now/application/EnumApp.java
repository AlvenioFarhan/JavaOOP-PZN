package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Alvenio");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDART");
        System.out.println(level);


        System.out.println("Print Jumlah Level");
        for ( Level value : Level.values()){
            System.out.println(value);
        }
    }
}
