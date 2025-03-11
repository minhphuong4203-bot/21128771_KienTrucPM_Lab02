package iuh.fit.se.lab01;

public class NewOrderState implements OrderState {
    public void next(Order order) {
        order.setState(new ProcessingOrderState());
    }
    public void prev(Order order) {
        System.out.println("Đơn hàng mới không thể quay lại trạng thái trước.");
    }
    public void printStatus() {
        System.out.println("Mới tạo");
    }
}
