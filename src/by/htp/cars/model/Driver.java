package by.htp.cars.model;

public class Driver {

	public String name;

	public Driver(String name) {
		this.name = name;
	}

	public void checkCar(Car car) {
		System.out.println("========== Info about car ==========" + "\n");
		System.out.println(car.model + "/" + car.engn.volume + "/" + car.year + car.mileage);
		System.out.println("_____________________________________" + "\n");
	}

}
