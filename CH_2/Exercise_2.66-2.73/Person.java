/** 
 * @author Richard Shepard
 * @version 1.26.15
 */

public class Person
{
    private String name;
    private String code;
    private int age;
    private int credits;
    
    public Person(String myName, int myAge) {
        name = myName;
        age = myAge;        
    }

   public String getName() {
       return name;
   }
   
   public void setAge(int age) {
       this.age = age;
   }
    
   public void printDetails() {
       System.out.println("The name of this person is " + name);
       System.out.println(name + " is " + age + " years old and has " + credits + " credits");
   }
}
