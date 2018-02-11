package by.htp.cars.runner;

import by.htp.cars.model.Car;
import by.htp.cars.model.Driver;

public class MainApp {

	public static void main(String[] args) {

		Driver drv = new Driver("Mike");
		
		Car bmw = new Car("BMW", "black", 2015, 20, 45000);
		
		drv.checkCar(bmw);
		

	}

}
