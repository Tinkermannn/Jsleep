package wilmanSaragihJSleepRA;


/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice extends Serializable{
    public int buyerId;
    public int renterId;
    public String time;
    
    public enum PaymentStatus {
        FAILED, WAITING, SUCCESS
    }
    
    public enum RoomRating {
        NONE, BAD, NEUTRAL, GOOD
    }
    
    public PaymentStatus status;
    public RoomRating rating;
    
    protected Invoice (int id, int buyerId, int renterId, String time) {
        super(id);
        this.buyerId = buyerId;
        this.renterId = renterId;
        this.time = time;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
    }
    
    public Invoice (int id, Account buyer, Renter renter, String time) {
        super(id);
        this.buyerId = buyer.id;
        this.renterId = renter.id;
        this.time = time;
        this.status = PaymentStatus.WAITING;
        this.rating = RoomRating.NONE;
    }
    
    public String print () {
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId + " Time : " + time ;
    }
}