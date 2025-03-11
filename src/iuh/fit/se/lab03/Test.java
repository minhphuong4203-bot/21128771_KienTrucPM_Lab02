package iuh.fit.se.lab03;

public class Test {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1 = new ProcessingFeeDecorator(payment1);
        payment1.pay(100);

        System.out.println();

        Payment payment2 = new PayPalPayment("minhphuong@gmail.com", "minhphuong");
        payment2 = new DiscountDecorator(payment2);
        payment2.pay(200);

        System.out.println();
    }
}
