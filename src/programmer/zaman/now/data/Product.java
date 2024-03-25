package programmer.zaman.now.data;

import java.util.Objects;

public class Product {

    public String name;
    public Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Product product = (Product) object;

        if (!Objects.equals(name, product.name)) return false;
        return Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

    //    public String toString() {
//        return "Product name: " + name + ", Price: " + price;
//    }
//
//    public boolean equals(Object object) {
//        if (object == this) {
//            return true;
//        }
//
//        if (!(object instanceof Product)) {
//            return false;
//        }
//
//        Product product = (Product) object;
//
//        if (this.price != product.price) {
//            return false;
//        }
//
//        if (this.name != null) {
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }

}
