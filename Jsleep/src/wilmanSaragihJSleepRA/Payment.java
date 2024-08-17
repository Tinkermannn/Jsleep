package wilmanSaragihJSleepRA;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice {
    public Date to, from;
    public int roomId;

    public Payment(int buyerId, int renterId, int roomId, Date from, Date to) {
        // super(id, buyerId, renterId);
        super(buyerId, renterId);
        this.to = new Date();
        this.from = new Date();   
        this.roomId = roomId;
        /* this.to = Calendar.getInstance();
            this.from = Calendar.getInstance();
        // add() method to add the days to the given date  
            to.add(Calendar.DATE, 2);
        */
       
    }

    public Payment(Account buyer, Renter renter, int roomId, Date from, Date to){
        // super(id, buyer, renter);
        super(buyer, renter);
        this.to = to;
        this.from = from;
        this.roomId = roomId;
        // this.to = Calendar.getInstance();
        //     this.from = Calendar.getInstance();
        // // add() method to add the days to the given date
        //     to.add(Calendar.DATE, 2);
    }
    
    public int getRoomId () {
        return this.roomId;
    }
    
    public String getTime (){
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        return sdf.format(this.time.getTime()); // access time from class Invoice
    }
    
    public static boolean makeBooking (Date from,Date to,Room room) {
        /* getDuration method
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
            return sdf.format(this.to.getTime()) + "-" + sdf.format(this.from.getTime());
        */
        if(from.after(to)){
            return false;
        }
       if (availability(from, to, room)) {
            room.booked.add(from);
            room.booked.add(to);
            return true;
        }
        return false;
    }
    
    /*
    public String print(){
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId +
        " Time : " + time + " RoomId : " + roomId + " From : " + from + " To : " + to;
    }
     */
    
    public static boolean availability(Date from,Date to,Room room) {
        if (room.booked.isEmpty()) {
            return true;   
        }
        
        for(Date i : room.booked) {
            if(i.after(from) || i.equals(from) && i.before(to) || i.equals(to)) {
                return false;
            }
        } 
        return true;
    }
    

}