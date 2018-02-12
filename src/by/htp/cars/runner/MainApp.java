package by.htp.cars.runner;

import by.htp.cars.model.Car;
import by.htp.cars.model.Driver;

public class MainApp {

	public static void main(String[] args) {

		Driver drv = new Driver("Mike");

//		Car Model/Color/Year/Mileage/Volume/FuelConsumption/WheelSize
		
		Car bmw = new Car("BMW 740", "black", 2018, 0, 4000, 20, 19);

		drv.checkCar(bmw);
		
		bmw.drive(40000);
		drv.checkCar(bmw);

		bmw.drive(20000);
		drv.checkCar(bmw);
	}

}
