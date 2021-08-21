package fromOtherProject.random;

public class Product {
    String name;
    double price;
    String merchant;

    public Product(String name, double price, String merchant) {
        this.name = name;
        this.price = price;
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", merchant='" + merchant + '\'' +
                '}';
    }
}
