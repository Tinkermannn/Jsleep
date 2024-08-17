package wilmanSaragihJSleepRA;
import java.util.Calendar;
import java.util.Date;

/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice extends Serializable{
    public int buyerId;
    public int renterId;
    public Date time;
    
    public enum PaymentStatus {
        FAILED, WAITING, SUCCESS
    }
    
    public enum RoomRating {
        NONE, BAD, NEUTRAL, GOOD
    }
    
    public PaymentStatus status;
    public RoomRating rating;

    protected Invoice(int buyerId, int renterId) {
        // super(id);
        super(); // id dihapus
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
        // this.time = Calendar.getInstance(); // Create a Calendar instance
        this.time = new Date(); // Create date object
    }
    
    public Invoice (Account buyer, Renter renter) {
        // super(id);
        super();
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
        // this.time = Calendar.getInstance(); // Create a Calendar instance
        this.time = new Date(); // Create date object
    }
    
    public String print () {
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId + " Time : " + time ;
    }
}