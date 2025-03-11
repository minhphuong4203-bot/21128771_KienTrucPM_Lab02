package iuh.fit.se.lab01;

public class CanceledOrderState implements OrderState{

    public void next(Order order) {
        System.out.println("Đơn hàng đã bị hủy, không thể chuyển tiếp.");
    }
    public void prev(Order order) {
        System.out.println("Đơn hàng đã bị hủy, không thể quay lại trạng thái trước.");
    }
    public void printStatus() {
        System.out.println("Đã hủy");
    }
}
