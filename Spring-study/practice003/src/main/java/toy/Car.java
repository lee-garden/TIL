package toy;

import battery.Battery;
import battery.NormalBattery;

public class Car {

	private Battery battery;
	
	Car(){	
	}
	
	public Car(Battery battery) {
		this.battery = battery;
		System.out.println("Car Constructor");
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	public void getBattery() {
		System.out.print("Car Battery : ");
		this.battery.getBattery();
	}
}
