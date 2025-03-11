package iuh.fit.se.lab03;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(Payment decoratedPayment) {
        super(decoratedPayment);
    }

    public double pay(double amount) {
        double fee = amount * 0.02; // 2% phí xử lý
        System.out.println("Áp dụng phí xử lý: " + fee);
        return super.pay(amount + fee);
    }
}
