package wilmanSaragihJSleepRA;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// public class Account
public class Account extends Serializable implements FileParser {
    // Ini variabel instance
    public String name;
    public String email;
    public String password;
    
    public Account (int id, String name, String email, String password){
        super(id); // acc
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    // Interface from FileParser
    public Object write(){
        return null;
    }
    public boolean read(String string){
        return false;
    }
    
    public String toString () {
        return "Account\nId: " + id + "\nName: " + name + "\nEmail: "+ email +"\nPassword: " + password;
    }
    
}