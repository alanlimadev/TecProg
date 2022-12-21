package tecProg;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;

public class Alan extends AdvancedRobot {

	public void run() {
		setColors(Color.blue, Color.black, Color.blue);
		while (true) {
			ahead(50);
			turnGunRight(270);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1.5);
	}

	public void onHitWall(HitWallEvent event) {
		turnRight(270);
	}

}