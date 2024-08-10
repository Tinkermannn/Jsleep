package wilmanSaragihJSleepRA;
import java.util.ArrayList;

/**
 * Write a description of class Validate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Validate {
    public static ArrayList filter (Price[] list, int value, boolean less) {
        ArrayList <Double> filteredList = new ArrayList();
        /*
         * Price: Tipe data dari elemen yang ada di dalam array list. 
         * item: Variabel sementara.
         * list: Array yang sedang diiterasi.
         */
        for(Price item : list) {
            if(less == true) {
                if(item.price <= value)
                    filteredList.add(item.price);
            } else if(less == false) {
                if(item.price > value)
                    filteredList.add(item.price);  
            }
        }
        return filteredList;
    }
}