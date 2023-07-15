package javaProject_Module;

   public class TwoWheeler extends Vehicle {
   public TwoWheeler() {
	   super("TwoWheeler",20, 10);
   }
   @Override
   
   
   
   public int calculateToll(int numberofPersons) {
	   if (numberofPersons<=0) {
		   System.out.println("Number of persons cannot be zero");
	   }
	   
	   int totalToll = basicToll;
	   
	   if(numberofPersons>2 && numberofPersons>0) {
		   
			   
			   int extraCharge = (numberofPersons-2)*extraCharges;
			   totalToll = totalToll+extraCharge;
			   
		   }
		   return totalToll;
	   }
   }

