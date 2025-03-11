package iuh.fit.se.lab03;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    public double pay(double amount) {
        double discount = amount * 0.1; // 10% giảm giá
        System.out.println("Áp dụng mã giảm giá: " + discount);
        return super.pay(amount - discount);
    }
}
