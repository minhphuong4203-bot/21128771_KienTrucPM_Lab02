package iuh.fit.se.lab01;

public class DeliveredOrderState implements OrderState {
    public void next(Order order) {
//        System.out.println("Đơn hàng đã giao, không thể chuyển tiếp.");
        order.setState(new CanceledOrderState());
    }
    public void prev(Order order) {
        order.setState(new ProcessingOrderState());
    }
    public void printStatus() {
        System.out.println("Đã giao");
    }
}
