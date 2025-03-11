package iuh.fit.se.lab01;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Trạng thái ban đầu:");
        order.printStatus();
        System.out.println("\n");
        System.out.println("Chuyển trạng thái:");
        order.nextState();
        order.printStatus();
        System.out.println("\n");
        System.out.println("Chuyển trạng thái:");
        order.nextState();
        order.printStatus();
        System.out.println("\n");
        System.out.println("Chuyển trạng thái:");
        order.nextState();
        order.printStatus();
        System.out.println("\n");
        System.out.println("Chuyển trạng thái:");
        order.nextState();
//        order.printStatus();
    }
}
