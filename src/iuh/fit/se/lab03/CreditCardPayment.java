package iuh.fit.se.lab03;

public class CreditCardPayment implements Payment{
    @Override
    public double pay(double amount) {
        System.out.println("Thanh toán bằng Thẻ tín dụng: " + amount);
        return amount;
    }
}
