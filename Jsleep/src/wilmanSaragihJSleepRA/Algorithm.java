package wilmanSaragihJSleepRA;

import java.util.Iterator;
import java.util.Arrays;

/* NOTE:
 * Iterable:
    * Interface dari koleksi yang dapat diiterasi (misalnya, List, Set).
    * Mendapatkan iterator yang dapat digunakan untuk iterasi elemen satu per satu.
 * Iterator:
    * Interface yang digunakan untuk mengakses elemen dalam koleksi satu per satu.
    * Metode seperti hasNext() dan next() digunakan untuk iterasi.
 */

public class Algorithm {

    private Algorithm(){

    }
    public  static <T> int count(Iterator<T> iterator,T val){
        // Iterator<T> = objek untuk iterasi
        // T val = nilai yang mau dicompare yg ada di dalama iterator
        final Predicate<T> pred =val::equals;
        /* Lambda Expression
         * final Predicate<T> pred = (T element) -> element.equals(val)
         * Membandingkan di mana val adalah objek yang nilai equals-nya
         * digunakan untuk membandingkan dengan elemen iterator.
         */
        return count(iterator,pred);
    }

    public  static <T> int count(T[] arr,T val){
        // Work dengan array dari tipe apapun karena <T>
        // T[] array prolly isinya elemen dari tipe T
        final Iterator<T> it = Arrays.stream(arr).iterator();
        // Arrays.stream(arr) mengonversi array arr menjadi stream dari elemen array.
        // iterator() kemudian mengonversi stream ini menjadi iterator.
        // Iterator ini digunakan untuk iterasi elemen-elemen array secara berurutan.
        return count(it,val);
    }

    public  static <T> int count(Iterable<T> iterable,Predicate<T> pred){
        /* Iterable<T> iterable: Koleksi elemen dari tipe T yang dapat diiterasi.
         * Predicate<T> pred: Fungsi boolean untuk menguji elemen dari Iterable.
         * Predikat ini menentukan kondisi yang harus dipenuhi oleh elemen yang dihitung.
         */
        final Iterator<T> it = iterable.iterator();
        /* iterable.iterator(): Mengambil iterator dari Iterable.
         * Iterator ini digunakan untuk mengakses elemen satu per satu dalam koleksi Iterable.
         */
        return count(it,pred);
        // Memanggil metode count lain yang menerima Iterator dan Predicate. Ini akan melakukan iterasi
    }

    public  static <T> int count(T[] arr,Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(arr).iterator();
        return count(it,pred);
    }
    public static <T> int count(Iterable<T> iterable,T val){
        final Iterator<T> it = iterable.iterator();
        return count(it,val);
    }
    public static <T> int count(Iterator<T> iterator, Predicate<T> pred) {
        int count = 0;
        while (iterator.hasNext()) {
            if (pred.predicate(iterator.next())) {
                count++;
            }
        }
        return count;
    }

    public static <T> boolean exists(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it,value);
    }
    public static <T> boolean exists(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return exists(it,value);
    }
    public static <T> boolean exists(Iterator<T> iterator, T value){
        final Predicate<T> pred =value::equals;
        return exists(iterator,pred);
    }
    public static <T> boolean exists(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it,pred);
    }
    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return exists(it,pred);
    }
    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred){
        while(iterator.hasNext()){
            if(pred.predicate(iterator.next())){
                return true;
            }
        }
        return false;
    }
    public static <T> T find(T[] arr, T val){
        final Iterator<T> it = Arrays.stream(arr).iterator();
        return find(it,val);
    }
    public static <T> T find(Iterable<T> iterable, T val){
        final Iterator<T> it = iterable.iterator();
        return find(it,val);
    }
    public static <T> T find(Iterator<T> iterator, T val){
        final Predicate<T> pred =val::equals;
        return find(iterator,pred);
    }
    public static <T> T find(T[] arr, Predicate<T> predicate){
        final Iterator<T> it = Arrays.stream(arr).iterator();
        return find(it,predicate);
    }
    public static <T> T find(Iterable<T> iterable, Predicate<T> predicate){
        final Iterator<T> it = iterable.iterator();
        return find(it,predicate);
    }
    public static <T> T find(Iterator<T> iterator, Predicate<T> predicate){
        while(iterator.hasNext()){
            T obj = iterator.next();
            if(predicate.predicate(obj)){
                return obj;
            }
        }
        return null;
    }
}
