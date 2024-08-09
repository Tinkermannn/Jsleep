package wilmanSaragihJSleepRA;

import java.util.Scanner;

/**
 *
 * @author (Wilman Saragih Sitio)
 * @version (2024)
 */
public class JSleep {
    public static void main (String [] args) {
        /** Scanner in = new Scanner (System.in);
        int beforeDiscount = in.nextInt();
        int afterDiscount = in.nextInt();
        int price = in.nextInt();
        double discountPercentage = in.nextDouble();
        int discountedPrice = in.nextInt();
        int numberOfNight = in.nextInt(); 
        */
       /** 
        System.out.println("Hotel Name: " + getHotelName());
        System.out.println("Discount Percentage: " + getDiscountPercentage(beforeDiscount, afterDiscount));
        System.out.println("Discounted Price: " + getDiscountedPrice(price, discountPercentage));
        System.out.println("Original Price: " + getOriginalPrice(discountedPrice, discountPercentage));
        System.out.println("Admin Fee: " + getAdminFee(price));
        System.out.println("Total Price: " + getTotalPrice(price, numberOfNight));
        */
        
       /*
        Room testroom = createRoom();
        System.out.println(testroom.name);
        System.out.println(testroom.size);
        System.out.println(testroom.price.price);
        System.out.println(testroom.facility);

        //in.close(); 
        */
       
        Complaint testComplain = new Complaint(1, "23 August 2022", "Bad Quality");
        Price testPrice = new Price(100000, 20000);
        Room testRoom = new Room(1, "Presidential Suite", 5, testPrice,
        Facility.FitnessCenter, City.DEPOK, "JL. Margonda Raya");
        Account testAccount = new Account(1, "Bob", "bob@gmail.com", "bob");
        Rating testRating = new Rating();
        System.out.println(testComplain.toString());
        System.out.println(testRoom.toString());
        System.out.println(testAccount.toString());
        System.out.println(testPrice.toString());
        System.out.println(testRating.toString());
    }
    
    public static int getHotelId (){
        return 0;
    }
    
    public static String getHotelName () {
        return "hotel";
    }
    
    public static boolean isDiscount () {
        return true;
    }
    
    public static double getDiscountPercentage (int beforeDiscount, int afterDiscount) {
        if (beforeDiscount > afterDiscount) {
            return (double) (beforeDiscount - afterDiscount)/beforeDiscount * 100;
        } else if (beforeDiscount < afterDiscount) {
            return 0;
        } else {
            return 0;
        }
    }
    
    public static int getDiscountedPrice(int price, double discountPercentage) {
        if (discountPercentage >= 100.0f) {
            return 0;
        } else {
            return (int)(price * ((100 - discountPercentage)/100));
        }   
    }
    
    public static int getOriginalPrice(int discountedPrice, double discountPercentage) {
        return (int) (discountedPrice / ((100 - discountPercentage)/100));
    }
    
    public static double getAdminFeePercentage() {
        return 0.05f;
    }
     
    public static int getAdminFee(int price){
        return (int) (getAdminFeePercentage() * price);
    }
    
    public static int getTotalPrice(int price, int numberOfNight) {
        return price * numberOfNight + getAdminFee(price * numberOfNight);
    }
    
    /*
    public static Room createRoom() {
        Price price = new Price(100000.0,5);
        Room room = new Room("Restaurant",30,price,Facility.AC);
        return room;
    }
    */
}
