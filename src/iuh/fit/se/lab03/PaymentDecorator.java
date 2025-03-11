package iuh.fit.se.lab03;

public abstract class PaymentDecorator implements Payment {
    protected Payment decoratedPayment;

    public PaymentDecorator(Payment decoratedPayment) {
        this.decoratedPayment = decoratedPayment;
    }

    public double pay(double amount) {
        return decoratedPayment.pay(amount);
    }
}
