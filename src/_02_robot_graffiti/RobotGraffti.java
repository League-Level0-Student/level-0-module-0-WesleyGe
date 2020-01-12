package _02_robot_graffiti;

import java.awt.AWTException;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffti {
public static void main(String[] args){
	Robot robot = new Robot();
	
	robot.penDown();
	robot.setSpeed(100);
	robot.turn(213);
	robot.move(100);
	robot.turn(120);
	robot.move(50);
	robot.turn(-120);
	robot.move(50);
	robot.turn(120);
	robot.move(100);
}
}
