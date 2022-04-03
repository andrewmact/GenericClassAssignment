package ca.mb.rrc.java2.assignemnt1;
/**
 * Car vehicle type class
 * 
 * with interface methods
 * 
 * drive @return returning print statements 
 * start @return returning print statements 
 * stop @return returning print statements 
 */
public class Car implements Vehicle{
	
	public void drive() {
		System.out.println("The car is driving");
	}


	public void start() {
		System.out.println("The car started");
	}

	
	public void stop() {
		System.out.println("The car stoped");
	}

}

