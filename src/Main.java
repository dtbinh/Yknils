import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;


public class Main {

	public static void main(String[] args) {
		System.out.println("Run Yknils");
		//Button.ENTER.waitForPress();
		DifferentialPilot p = new DifferentialPilot(2.25f, 5.5f, Motor.A, Motor.B);
		p.setTravelSpeed(2);
		p.travel(-9);
	}

}
