package by.htp.cars.model;

public class Driver {

	public String name;

	public Driver(String name) {
		this.name = name;
	}

	public void checkCar(Car car) {
		System.out.println("========== Info about car ==========" + "\n");
		System.out.println(car.model + "/" + car.engn.volume + "cm3/" + car.year + "year/" + car.mileage + "miles" + "\n");

		for (int i = 0; i < car.wheels.length; i++) {
			System.out.println("wheel #" + car.wheels[i].number + " size:" + car.wheels[i].size + " "
					+ car.wheels[i].replacementCount + " replacements");
		}

		System.out.println("\nfuel consumption: " + car.engn.fuelBurnt + " litres (" + car.engn.fuelConsumption + " l per 100 miles)");

		System.out.println("_____________________________________" + "\n");
	}

}
