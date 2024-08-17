package wilmanSaragihJSleepRA;
import java.util.Date;
import java.util.ArrayList;

/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room extends Serializable implements FileParser{
    public int size;
    public String name, address;
    public Facility facility;
    public Price price;
    public BedType bedType;
    public City city;
    public ArrayList<Date> booked;
    
    public Room(String name, int size, Price price, Facility facility, City city, String address) {
        // super(id);
        super();
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.address = address;
        this.city = city;
        this.bedType = BedType.SINGLE;  
        this.booked = new ArrayList<Date>(); // only acc "Date" object
    }
    
    // Interface from FileParser
    public Object write(){
        return null;
    }
    public boolean read(String string){
        return false;
    }
    
    public String toString (){
         return "Room\nId: " + id + "\nName: " + name + "\nSize: " + size + 
         "\nPrice: " + price + "\nFacility: " + facility + "\nCity: " + city + 
         "\nAddress: " + address + "\nBed Type: " + bedType; 
    }
    
 
}