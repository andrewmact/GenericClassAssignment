package ca.mb.rrc.java2.assignemnt1;

/**
 * 
 * Test class
 *
 */
public class VehicleRentalTest {

	
	public static void main(String[] args) {
		//Vehicle type instances
		Car car = new Car();
		Van van = new Van();
		MotorCycle motorcycle = new MotorCycle();
			
	//Vehicle rental instances with rent method
	VehicleRental<Car> test1 = new VehicleRental<Car>(car);
					   test1.rent(car);
	
	VehicleRental<Van> test2 = new VehicleRental<Van>(van);				  
					   test2.rent(van);
			
	VehicleRental<MotorCycle> test3 = new VehicleRental<MotorCycle>(motorcycle);
							  test3.rent(motorcycle);	
									
	}

}
