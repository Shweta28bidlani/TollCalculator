   package javaProject_Module;

   public class FourWheeler extends Vehicle {
    public FourWheeler() {
    	super("FourWheeler", 40, 40);
    	
    }
    @Override
    public int calculateToll(int numberofPersons) {
    	if(numberofPersons<=0) {
    		System.out.println("Number of persons cannot be zero");
    		
    	}
    	int totalToll = basicToll;
    	if (numberofPersons>4 && numberofPersons>0) {
    		
    		int extraCharge = (numberofPersons-4)*extraCharges;
    		totalToll = totalToll+extraCharge;
    	}
    	
    	return totalToll;
    }
    
}
