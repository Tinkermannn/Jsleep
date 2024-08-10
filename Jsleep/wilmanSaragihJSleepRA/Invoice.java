package wilmanSaragihJSleepRA;
import java.util.Calendar;

/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice extends Serializable{
    public int buyerId;
    public int renterId;
    public Calendar time;
    
    public enum PaymentStatus {
        FAILED, WAITING, SUCCESS
    }
    
    public enum RoomRating {
        NONE, BAD, NEUTRAL, GOOD
    }
    
    public PaymentStatus status;
    public RoomRating rating;
    
    protected Invoice (int id, int buyerId, int renterId) {
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
        this.time = Calendar.getInstance(); // Create a Calendar instance
    }
    
    public Invoice (int id, Account buyer, Renter renter) {
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
        this.time = Calendar.getInstance(); // Create a Calendar instance
    }
    
    public String print () {
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId + " Time : " + time ;
    }
}