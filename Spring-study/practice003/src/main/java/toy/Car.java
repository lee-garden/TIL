package toy;

import battery.Battery;
import battery.NormalBattery;

public class Car {

	private Battery battery;
	
	public Car(Battery battery) {
		this.battery = battery;
		System.out.println("Car Constructor");
	}
	
	public void setBattery(Battery bettery) {
		this.battery = battery;
	}
}
