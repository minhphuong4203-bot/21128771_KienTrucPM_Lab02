package iuh.fit.se.lab03;

public class PayPalPayment implements Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public double pay(double amount) {
        System.out.println("Thanh toán bằng Thẻ tín dụng: " + amount);
        System.out.println("Email: " + email);
        System.out.println("Mật khẩu: " + password);
        return amount;
    }
}
