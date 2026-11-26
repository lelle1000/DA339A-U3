import java.util.ArrayList;

public class OrderHistory {
    private ArrayList<Order> completeOrders;
    private Order currentOrder;
    private int orderId;

    public OrderHistory() {
        this.completeOrders = new ArrayList<>();
        this.orderId = 1;
        this.currentOrder = new Order(orderId++);
    }
}
