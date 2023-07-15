     package javaProject_Module;

     public class HeavyVehicle extends Vehicle {
    	 public HeavyVehicle() {
    		 super("HeavyVehicle", 60,100);
    	 }
    	 @Override
    	 public int calculateToll(int numberofPersons) {
    		  
    		 if (numberofPersons<=0) {
    			 System.out.println("Number of persons cannot be Zero");
    			 
    		 }
    		 int totalToll = basicToll;
    		 if (numberofPersons>6 && numberofPersons>0) {
    			 int extraCharge = (numberofPersons-6)*extraCharges;
    			 totalToll = totalToll+extraCharges;
    		 }
    		 return totalToll;
    	 }
    	 

}
