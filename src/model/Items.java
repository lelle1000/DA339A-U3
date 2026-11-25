public abstract class Items {
    private String productName;
    private double price;

    public Items(String productName, double price) {
        setProductName(productName);
        setPrice(price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = (productName == null) ? "Not set" : productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price < 0.0) ? 0.0 : price;
    }

    public abstract double calculatePrice();

}