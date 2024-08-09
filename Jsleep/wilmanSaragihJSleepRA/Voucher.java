package wilmanSaragihJSleepRA;


/**
 * Write a description of class Voucher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Voucher extends Serializable {
    public Type type;
    public double minimum, cut;
    public String name;
    public int code;
    private boolean used;
    
    public Voucher (int id, String name, int code, Type type, double minimum, double cut){
        super(id);
        this.name = name;
        this.code = code;
        this.type = type;
        this.minimum = minimum;
        this.cut = cut; 
        this.used = used;
    }
    
    public boolean isUsed () {
        return used;
    }
    
    public boolean canApply(Price price) {
        if(price.price > this.minimum && used == false) {
            return true;
        } else {
            return false;
        }
    }
    
    public double apply(Price price) {
        this.used = true;
        if (this.type == Type.DISCOUNT) {
            if(this.cut > 100.0)
                this.cut = 100.0;
                
            return price.price - price.price * this.cut/100;
        } else {
            if(this.cut < price.price) {
                this.cut = price.price;
            }
            return price.price - this.cut;
        }
    }
}