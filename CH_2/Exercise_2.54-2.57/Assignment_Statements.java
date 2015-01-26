
/** 
 * @author Richard Shepard 
 * @version 1.26.15
 */
public class Assignment_Statements
{
    private int price;
    private int discount;
    private int saving;
    private int count;
    private int mean;  
    private int budget;
    private int total;
   
    public Assignment_Statements() {
       saving = price * discount;
       mean = total / count;
       if (price > budget) {
           System.out.println("Too expensive");
       } else {
           System.out.println("Just right");
       }
       if (price > budget) {
           System.out.println("Too expensive. Your budget is " + budget);
       } else {
           System.out.println("Just right");
       }
    }
}
