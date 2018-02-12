package by.htp.cars.model;

public class Car {

	public String model;
	public String color;
	public int year;
	public int mileage;

	public Wheel[] wheels;
	public Engine engn = new Engine();

	public Car(String model, String color, int year, int mileage, int volume, int fuelConsumption, int wheelsSize) {

		this.model = model;
		this.color = color;
		this.year = year;
		this.mileage = mileage;

		this.engn.volume = volume;
		this.engn.fuelConsumption = fuelConsumption;

		wheelsInit(wheelsSize);
	}

	public void wheelsInit(int wheelsSize) {
		wheels = new Wheel[4];
		for (int i = 0; i < 4; i++) {
			wheels[i] = new Wheel(wheelsSize, i + 1, 0);
		}
	}

	public void drive(int km) {
		this.mileage = this.mileage + km;
		int numberWheel = 0;
		for (int i = km / 10000; i > 0; i--) {
			numberWheel = (int) (Math.random() * 4); 	//change 1 wheel (every 10.000)
			changeWheel(numberWheel);
		}
		petrol(km);
	}

	public void changeWheel(int num) {
		wheels[num].replacementCount++;
	}

	public void petrol(int km) {
		engn.fuelBurnt = engn.fuelBurnt + km / engn.fuelConsumption;
	}

}
