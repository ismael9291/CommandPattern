

public class RcBoat implements Devices {

	private int speed = 0;

	public void on() {

		System.out.println("The RC boat is on.");

	}

	public void off() {

		System.out.println("The RC boat is off");

	}

	public void standby() {

		System.out.println("The RC boat is on standby");

	}

	public void up() {

		speed++;
		System.out.println("Speed of the RC boat is " + speed);

	}

	public void down() {

		speed--;
		System.out.println("Speed of the RC boat is " + speed);

	}

}
