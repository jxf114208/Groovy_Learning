package ch2.GroovyForJavaEyes;

public class Car {

	private int miles;
	private final int year;

	public Car(int theYear) {
		year = theYear;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
	
	

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		Car car = new Car(2008);
		
		System.out.println("Year:" + car.getYear());
		System.out.println("Miles:" + car.getMiles());
		System.out.println("Setting miles");
		car.setMiles(25);
		System.out.println("Miles:" + car.getMiles());
	}

}
