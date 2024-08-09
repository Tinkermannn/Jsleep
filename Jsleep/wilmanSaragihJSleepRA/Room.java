package wilmanSaragihJSleepRA;


/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room extends Serializable{
    public int size;
    public String name, address;
    public Facility facility;
    public Price price;
    public BedType bedType;
    public City city;
    
    public Room(int id, String name, int size, Price price, Facility facility, City city, String address) {
        super(id);
        this.name = name;
        this.size = size;
        this.price = price;
        this.facility = facility;
        this.address = address;
        this.city = city;
        this.bedType = BedType.SINGLE;  
    }
    
    public String toString (){
         return "Room\nId: " + id + "\nName: " + name + "\nSize: " + size + 
         "\nPrice: " + price + "\nFacility: " + facility + "\nCity: " + city + 
         "\nAddress: " + address + "\nBed Type: " + bedType; 
    }
}