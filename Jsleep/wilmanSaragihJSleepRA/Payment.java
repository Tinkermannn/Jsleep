package wilmanSaragihJSleepRA;


/**
 * Write a description of class Payment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payment extends Invoice {
    public String to, from;
    public int roomId;
    
    public Payment (int id, int buyerId, int renterId, String time, int roomId, String from, String to){
        super(id, buyerId, renterId, time);
        this.to = to;
        this.from = from;
        this.roomId = roomId;
    }

    public Payment (int id, Account buyer, Renter renter, String time, int roomId, String from, String to){
        super(id, buyer, renter, time);
        this.to = to;
        this.from = from;
        this.roomId = roomId;
    }
    
    public int getRoomId () {
        return this.roomId;
    }
    
    public String print(){
        return "Id :" + id + " BuyerId :" + buyerId + " RenterId : " + renterId +
        " Time : " + time + " RoomId : " + roomId + " From : " + from + " To : " + to;
    }
}