/**
 * @author Richard Shepard
 * @version 1.20.2015
 */

public class Customer {
	
	private String name;
	private int orderNumber;
	private Desk desk;
	
	public Customer() {
		setName();
		setOrderNumber();
		desk = new Desk();
	}
	
	private void setName() {
		System.out.print("Please enter customer name : ");
		name = TextIO.getln();
		while (!(name.matches("^[a-z A-z]*$"))) {
			System.out.println("Invalid input....please input valid name.");
			setName();
		}
	}
	
	private void setOrderNumber() {
		System.out.print("Please enter customer number : ");
		orderNumber = TextIO.getInt();          // No need to sanitize, TextIO.getInt() only accepts integers
	}
	
	public String getName() {
		return name;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public String toString() {
		String line1 = "Name: " + name + "          Order#: " + orderNumber;
		String line2 = desk.toString();
		String multilineString = String.format("%s\n%s\n",line1,line2);
		return multilineString;
	}

}
