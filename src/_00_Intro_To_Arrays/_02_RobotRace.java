package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int x = 0; x < 5; x++) {
			robots[x] = new Robot();
			robots[x].setY(550);
			robots[x].setX((90 * x) + 50);
			robots[x].setSpeed(100);
			robots[x].penDown();
		}

		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean winCon = true;
		
			while (winCon) {
				Random ran = new Random();
				for (int x = 0; x < 5; x++) {
					int movement = ran.nextInt(50);
					for (int y = 0; y < movement; y++) {
						robots[x].move(5);
						robots[x].turn(1);
						
						
						if (robots[x].getY() >= 551 && robots[x].getY() <= 557 && robots[x].getX() < 420) {
							winCon = false;
							JOptionPane.showMessageDialog(null, x + 1 + " won.");
							break;
						}
					}
					
					
				}
			}
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner!
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
