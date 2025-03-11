package iuh.fit.se.lab02;

public class Test {
    public static void main(String[] args) {
        Product phone = new Product("Điện thoại", 1000, new VATTax());
        phone.printPriceDetails();

        Product wine = new Product("Rượu vang", 200, new ConsumptionTax());
        wine.printPriceDetails();

        Product watch = new Product("Đồng hồ xa xỉ", 5000, new LuxuryTax());
        watch.printPriceDetails();
    }
}
