/**
 * @author Richard Shepard
 * @version 1.20.2015
 */

public class Desk {

	private int area;
	private int numDrawers;
	private int totalCost;
	
	private String wood;

	public Desk() {
		setArea();
		setWood();
		setDrawers();
		setTotalCost();
	}
	
	private void setArea() {
		System.out.println("Please enter Dimesions for the desk");
		System.out.print("Length in inches: ");
		int length = TextIO.getInt();
		System.out.print("Width in inches: ");
		int width = TextIO.getInt();
		area = length * width;		
	}
	
	private void setWood() {
		wood = "";
		while (!(wood.equalsIgnoreCase("oak") || wood.equalsIgnoreCase("pine") || wood.equalsIgnoreCase("mahogany"))) {
			System.out.print("Please enter wood type (pine, oak, or mahogany): ");
			wood = TextIO.getlnWord();	
			if (!(wood.equalsIgnoreCase("oak") || wood.equalsIgnoreCase("pine") || wood.equalsIgnoreCase("mahogany"))) {
				System.out.println("Invalid wood please enter pine, oak, or mahogany....");
				setWood();
			}
		}
	}
	
	private void setDrawers() {
		System.out.print("Please enter the number of drawers: ");
		numDrawers = TextIO.getInt();
		while (numDrawers < 0) {
			System.out.print("\nCannot have negative drawers, please input positive number");
			setDrawers();
		}
	}
	
	private void setTotalCost(){
		final int BASE_PRICE = 200;
		final int DRAWER_PRICE = 30;
		final int PINE = 0;
		final int OAK = 125;
		final int MAHOGANY = 150;
		final int MAX_AREA = 750;
		final int EXTRA_AREA_COST = 50;
		
		totalCost += BASE_PRICE;
		totalCost += DRAWER_PRICE * numDrawers;
		if (area > MAX_AREA) {
			totalCost += EXTRA_AREA_COST;
		}
		if (wood.equalsIgnoreCase("oak")){
			totalCost += OAK;
		} else if (wood.equalsIgnoreCase("mahogany")) {
			totalCost += MAHOGANY;
		} else {
			totalCost += PINE;
		}
	}
	
	public String toString() {
		String line1 = "         Desk Order";
		String line2 = "=================================";
		String line3 = "Area:           " + area;
		String line4 = "Drawers:        " + numDrawers;
		String line5 = "Wood:           " + wood;
		String line6 = "Total:         $" + totalCost;
		String multilineString = String.format("%s\n%s\n%s\n%s\n%s\n%s\n",line1,line2,line3,line4,line5,line6);
		return multilineString;
	}
	
	
}
