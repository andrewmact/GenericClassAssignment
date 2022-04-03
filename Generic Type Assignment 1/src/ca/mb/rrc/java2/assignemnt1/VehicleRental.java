package ca.mb.rrc.java2.assignemnt1;

/**
 * @author main
 * Vehicle Interface
 * To be used by Car, Van, and Motorcycle vehicle classes
 */
interface Vehicle {

	public void drive();
	public void start();
	public void stop();
	
}
/**
 * VehicleRental class
 *
 * METHODS
 * Constructor
 * Rent
 *
 * @param <T> generic type
 */
class VehicleRental <T extends Vehicle> {

	T vehicle;
	/**
	 * Vehicle rental constructor
	 * @param objectPassed (Vehicle type object)
	 * set to instance of vehicle rental
	 */
	public VehicleRental(T objectPassed) 
	{
	vehicle = objectPassed;
	} 

	/**
	 * @param vehicleOfType (Car, Van, Motorcycle)
	 * @return drive method of vehicle type
	 */
	public void rent(T vehicleOfType)
	{
	if(vehicleOfType instanceof Car) {
		((Car)vehicle).drive();
	}
	else if(vehicleOfType instanceof Van) {
		((Van)vehicle).drive();
	}
	else if(vehicleOfType instanceof MotorCycle) {
		((MotorCycle)vehicle).drive();
	}
  }
	
}