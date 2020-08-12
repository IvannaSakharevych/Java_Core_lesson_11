package Task_2;

public class Car {

	private int horsepower;
	private int year;
	private Helm helm;
	private Engine engine;
	
	
	public Car(int horsepower, int year, Helm helm, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.year = year;
		this.helm = helm;
		this.engine = engine;
	}


	public int getHorsepower() {
		return horsepower;
	}


	public int getYear() {
		return year;
	}


	public Helm getHelm() {
		return helm;
	}


	public Engine getEngine() {
		return engine;
	}


	@Override
	public String toString() {
		return "Car [horsepower=" + horsepower + ", year=" + year + ", helm=" + helm + ", engine=" + engine + "]";
	}
	
	
	
}
