package by.htp.cars.model;

public class Car {

	public String model;
	public String color;
	public int year;
	public int fuel—onsumption;
	public int mileage;
	
	public Wheel[] wheels;
	
	public Engine engn = new Engine(4000);

	public Car(String model, String color, int year, int fuel—onsumption, int mileage) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.year = fuel—onsumption;
		this.year = mileage;
	}

	
	public void Drive(int km) {
		
	}

	public void Petrol() {

	}

	public void ChangeWheel() {

	}

}
