package iuh.fit.se.lab02;

public class VATTax implements TaxStrategy {
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
