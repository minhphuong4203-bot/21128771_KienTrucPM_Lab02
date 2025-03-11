package iuh.fit.se.lab01;

public class ProcessingOrderState implements OrderState {
    public void next(Order order) {
        order.setState(new DeliveredOrderState());
    }
    public void prev(Order order) {
        order.setState(new NewOrderState());
    }
    public void printStatus() {
        System.out.println("Đang xử lý");
    }
}
