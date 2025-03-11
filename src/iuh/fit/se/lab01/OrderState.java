package iuh.fit.se.lab01;

public interface OrderState {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}
