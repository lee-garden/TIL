package toy;

import battery.Battery;
import battery.NormalBattery;

public class Robot {

	private Battery battery;
	
	public Robot() {
		this.battery = new NormalBattery();
		System.out.println("Robot Constructor");
	}
}
