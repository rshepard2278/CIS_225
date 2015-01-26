
/**
 * @author Richard Shepard
 * @version 1.23.15
 */
public class Date
{
    private String month;
    private int day;
    private int year;
    
    public Date(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public String getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getYear() {
        return year;        
    }
    
    public String toString() {
        String str = month + ", " + day + ", " + year;
        return str;
    }
    
    public void printDate() {
        System.out.println(this.toString());
    }

}
