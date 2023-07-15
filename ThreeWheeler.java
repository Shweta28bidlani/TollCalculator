package javaProject_Module;

   public class ThreeWheeler extends Vehicle {
	public ThreeWheeler() {
		super("ThreeWheeler", 30,20);
	}
	@Override
	
	public int calculateToll(int numberofPersons) {
		
		if (numberofPersons<=0) {
			
			System.out.println("Number of persons cannot be zero");
		}
		int totalToll = basicToll;
		
		if(numberofPersons>3 && numberofPersons>0) {
			int extraCharge = (numberofPersons-3)*extraCharges;
			totalToll = totalToll+extraCharges;
			
		}
		return totalToll;
	}

}
