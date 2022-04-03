package ca.mb.rrc.java2.assignemnt1;
/**
 * Van vehicle type class
 * 
 * with interface methods 
 * 
 * drive @return returning print statements 
 * start @return returning print statements 
 * stop @return returning print statements 
 */
public class Van implements Vehicle{

	
	public void drive() {
		System.out.println("The van is driving");
		
	}


	public void start() {
		System.out.println("The van started");
	}

	
	public void stop() {
		System.out.println("The van stopped");
		
	}

}
