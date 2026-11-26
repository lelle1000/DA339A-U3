public class Accessories extends Items {
    public Accessories(String productName, double price) {
        super(productName, price);
    }

    @Override 
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return getProductName() + ", " + calculatePrice();
    }
}