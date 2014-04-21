

public class RcCar implements Devices {
	
	private int speed = 0;

	public void on() {

		System.out.println("The RC car is on.");

	}

	public void off() {

		System.out.println("The RC car is off");

	}

	public void standby() {

		System.out.println("The RC car is on standby");

	}

	public void up() {

		speed++;
		System.out.println("Speed of the RC car is " + speed);

	}

	public void down() {

		speed--;
		System.out.println("Speed of the RC car is " + speed);

	}

}
