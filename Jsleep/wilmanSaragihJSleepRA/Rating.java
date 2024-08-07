package wilmanSaragihJSleepRA;


/**
 *
 * @author (Wilman Saragih Sitio)
 * @version (2024)
 */
public class Rating {
    private long total;
    private long count;
    
    public Rating () {
        this.total = 0;
        this.count = 0;
    }
    
    public void insert(int rating) {
        total += rating;
        count ++;
    }
    
    public double getAverage() {
        if (count == 0)
            return 0;
        else 
            return (double)(total/count);
    }

    public long getCount() {
        return count;
    }
    
    public long getTotal(){
        return total;
    }
}