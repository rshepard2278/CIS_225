/**
 * @author Richard Shepard 
 * @version 1.26.15
 */

import static java.lang.Math.abs;

public class Heater{
   
    private double temp;
    private double min;
    private double max;
    private double increment;
    
    public Heater(int max, int min) {
        temp = 15.0;
        increment = 5.0;
        this.max = max;
        this.min = min;
    }
    
    public void warmer() {
        if (temp + increment <= max) {
            temp += increment;
        } else {
            System.out.println("That would put temp over max temp");
        }
    }
    
    public void cooler() {
        if (temp - increment >= min) {
            temp -= increment;
        } else {
            System.out.println("That would put temp under min temp");
        }
    }
    
    public void setIncrement(double increment) {
        increment = Math.abs(increment);
        this.increment = increment;
    }
    
    public double getTemp() {
        return temp;
    }
}
