package wilmanSaragihJSleepRA;
import java.util.Calendar;
import java.text.SimpleDateFormat;  

/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice {
    public Calendar to, from;
    public int roomId;
    
    public Payment(int id, int buyerId, int renterId, int roomId) {
        super(id, buyerId, renterId);
        this.to = Calendar.getInstance();
        this.from = Calendar.getInstance();
        // add() method to add the days to the given date  
        to.add(Calendar.DATE, 2);
        this.roomId = roomId;
    }

    public Payment(int id, Account buyer, Renter renter, int roomId){
        super(id, buyer, renter);
        this.to = Calendar.getInstance();
        this.from = Calendar.getInstance();
        // add() method to add the days to the given date  
        to.add(Calendar.DATE, 2);
        this.roomId = roomId;
    }
    
    public int getRoomId () {
        return this.roomId;
    }
    
    public String getTime (){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(this.time.getTime()); // access time from class Invoice
    }
    
    public String getDuration () {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(this.to.getTime()) + "-" + sdf.format(this.from.getTime());
    }
    /*
    public String print(){
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId +
        " Time : " + time + " RoomId : " + roomId + " From : " + from + " To : " + to;
    }
     */
    
    

}