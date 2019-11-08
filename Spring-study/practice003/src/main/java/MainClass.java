import java.io.ObjectInputStream.GetField;

import org.springframework.context.support.GenericXmlApplicationContext;

import battery.ChargeBattery;
import toy.Car;
import toy.Robot;

public class MainClass {

	public static void main(String[] args) {
		
//		Robot robot = new Robot();
//		Car car = new Car(new ChargeBattery());
	
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Robot robot = ctx.getBean("Robot", Robot.class);
		Car car = ctx.getBean("Car", Car.class);
	}

}
