package wilmanSaragihJSleepRA;


/**
 *
 * @author (Wilman Saragih Sitio)
 * @version (2024)
 */
public class Price {
    public double price;
    public double discount;
    
    public Price (double price){
        this.price = price;
        this.discount = 0;
    }
    
    
    public Price(double price, double discount) {
        this.price = price;
        this.discount = discount;
        // this.discount = 0;
    }
    
    public String toString () {
        return "Price\nPrice: " + price + "\nDiscount: " + discount;
    }
    /* private double getDiscountedPrice() {
        if (discount > 100.0) {
            discount = 100;
        } else if (discount == 100.0) {
            discount = 0;
        }
        return price - (double)price * discount/100.0;
    }
    
    private double getRebatedPrice() {
        if (rebate > price) {
            return price;
        } else {
            return price - rebate; // kembalian maybe
        }
    } */
}