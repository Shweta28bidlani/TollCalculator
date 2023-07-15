package javaProject_Module;

public abstract class Vehicle {
	
	protected String vehicleType;
	protected int basicToll;
	protected int extraCharges;
	
	public Vehicle(String vehicleType, int basicToll, int extraCharges) {
		
	this.vehicleType = vehicleType;
	this.basicToll = basicToll;
	this.extraCharges = extraCharges;
	
		
	}
	public abstract int calculateToll (int numberofpersons);
	public String getVehicleType() {
		return vehicleType;
		
	}
	
	

}
