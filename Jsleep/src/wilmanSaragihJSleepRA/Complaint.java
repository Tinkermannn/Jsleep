package wilmanSaragihJSleepRA;


/**
 * Write a description of class Complaint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Complaint extends Serializable {
    public String desc, date;

    protected Complaint(String date, String desc) { // id dihapus for Complaint, Account, Invoice
        // super(id);
        super();
        this.date = date;
        this.desc = desc;
    }
    
    public String toString (){
        return "Complaint\nId:" + id + "\nDesc: " + desc + "\nDate:" + date;
    }
}