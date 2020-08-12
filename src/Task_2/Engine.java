package Task_2;

public class Engine {

	private int cylinders;

	public Engine(int cylinders) {
		//super();
		this.cylinders = cylinders;
	}

	public int getCylinders() {
		return cylinders;
	}

	@Override
	public String toString() {
		return "Engine [cylinders=" + cylinders + "]";
	}	
	
	
	
}
