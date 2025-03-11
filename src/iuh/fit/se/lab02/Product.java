package iuh.fit.se.lab02;

public class Product {
    private String name;
    private double price;
    private TaxStrategy taxStrategy;


    public Product(String name, double price, TaxStrategy taxStrategy) {
        this.name = name;
        this.price = price;
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double getFinalPrice() {
        return price + taxStrategy.calculateTax(price);
    }

    public void printPriceDetails() {
        System.out.println(name + " - Giá gốc: " + price + " - Thuế: " + taxStrategy.calculateTax(price) + " - Tổng: " + getFinalPrice());
    }

}
