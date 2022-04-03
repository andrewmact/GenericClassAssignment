package ca.mb.rrc.java2.assignemnt1;
/**
 * Motorcycle vehicle type class
 * 
 * with interface methods
 * 
 * drive @return returning print statements 
 * start @return returning print statements 
 * stop @return returning print statements 
 */
public class MotorCycle implements Vehicle {

	
	public void drive() {
		System.out.println("The motorcycle is driving");
	}

	
	public void start() {
		System.out.println("The motorcycle started");
		
	}

	
	public void stop() {
		System.out.println("The motorcycle stopped");
		
	}

}
