package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.stop();//inherited
		b.refuel();//inherited
		b.start();//overriden
		b.autoParking();//individual
		b.getName();
		
		BMW.getName();
		
		b.speed = 300;
		System.out.println(b.speed);
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		Car.getName();
		
		//child class object can be referred by parent class ref variable:
		//top casting:
		Car c1 = new BMW();
		c1.stop();
		c1.refuel();
		c1.start();
		
		//down casting: parent object can be referred by child class ref variable
		//BMW b1 = (BMW)new Car();
		
		
		
	}

}
