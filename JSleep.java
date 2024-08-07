

import java.util.Scanner;

/**
 * Write a description of class JSleep here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JSleep {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        int beforeDiscount = in.nextInt();
        int afterDiscount = in.nextInt();
        int price = in.nextInt();
        float discountPercentage = in.nextFloat();
        int discountedPrice = in.nextInt();
        int numberOfNight = in.nextInt();
        
        System.out.println("Hotel Name: " + getHotelName());
        System.out.println("Discount Percentage: " + getDiscountPercentage(beforeDiscount, afterDiscount));
        System.out.println("Discounted Price: " + getDiscountedPrice(price, discountPercentage));
        System.out.println("Original Price: " + getOriginalPrice(discountedPrice, discountPercentage));
        System.out.println("Admin Fee: " + getAdminFee(price));
        System.out.println("Total Price: " + getTotalPrice(price, numberOfNight));

        in.close(); 
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
    public static float getDiscountPercentage (int beforeDiscount, int afterDiscount) {
        if (beforeDiscount > afterDiscount) {
            return (float) (beforeDiscount - afterDiscount)/beforeDiscount * 100;
        } else if (beforeDiscount < afterDiscount) {
            return 0;
        } else {
            return 0;
        }
    }
    public static int getDiscountedPrice(int price, float discountPercentage) {
        if (discountPercentage >= 100.0f) {
            return 0;
        } else {
            return (int)(price * ((100 - discountPercentage)/100));
        }   
    }
    public static int getOriginalPrice(int discountedPrice, float discountPercentage) {
        return (int) (discountedPrice / ((100 - discountPercentage)/100));
    }
    
    public static float getAdminFeePercentage() {
        return 0.05f;
    }
     
    public static int getAdminFee(int price){
        return (int) (getAdminFeePercentage() * price);
    }
    public static int getTotalPrice(int price, int numberOfNight) {
        return price * numberOfNight + getAdminFee(price * numberOfNight);
    }
}
