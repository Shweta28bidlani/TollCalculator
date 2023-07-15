  package javaProject_Module;

  import java.util.Scanner;

  public class TollCalculatorMain {
	  static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice = 0;
		while (choice != 5) {
			choice = ShowMenuAndGetChoice();
			
			switch (choice) {
			case 1: {
			System.out.println("Enter the number of persons");
			int noOfPersons = s.nextInt();
			
			Vehicle twoWheeler = new TwoWheeler();
			
			int toll = twoWheeler.calculateToll(noOfPersons);
			System.out.println("Total toll of your Vehicle is:  " + toll);
			
			}
			break;
			
			case 2:{
				System.out.println("Enter the number of persons");
				int noOfPersons = s.nextInt();
				
				Vehicle threeWheeler = new ThreeWheeler();
				int toll = threeWheeler.calculateToll(noOfPersons);
				System.out.println("Total Toll of your Vehicle Is: " + toll);
				
			}
			break;
			case 3: {
				System.out.println("Enter the number of persons: ");
				int noOfPersons = s.nextInt();
				Vehicle fourWheeler = new FourWheeler();
				
				int toll = fourWheeler.calculateToll(noOfPersons);
				System.out.println("Total toll of your vehicle is: " + toll);
				
			}
			break;
			case 4: {
				System.out.println("Enter the number of persons: ");
				int noOfPersons = s.nextInt();
				
				Vehicle heavyVehicle = new HeavyVehicle();
				int toll = heavyVehicle.calculateToll(noOfPersons);
				System.out.println("Total toll of your vehicle is: " + toll);		
				
			}
			break;
				case 5:	{
					break;
				}
				default:{
					System.out.println("Invalid choice... Please try again!");
					break;
				}
									
				}
			}
		}
	   private static int ShowMenuAndGetChoice() {
		   System.out.println("Welcome to the online calculator");
		   System.out.println("1. Two Wheeler");
		   System.out.println("2. Three Wheeler");
		   System.out.println("3. Four Wheeler");
		   System.out.println("4. Heavy Vehicle");
		   System.out.println("Exit");
		   System.out.println("Enter your Vehicle type");
		   int choice = s.nextInt();
		   return choice;
	   }
    
  }
		
