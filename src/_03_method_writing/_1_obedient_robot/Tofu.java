package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Tofu {
	 public static void main(String[] args) {
		Tofu r= new Tofu();
		r.square();
		r.triangle();
		r.circle();
	 }
		Robot rob = new Robot();	
		
		public void square() {
		rob.penDown();
		rob.setSpeed(100);
		for (int i=0; i<4; i++) {

			rob.move(100);
			rob.turn(90);
		}
		}	
		public void triangle() {
			rob.penDown();
			rob.setSpeed(100);
			rob.setX(200);
			rob.setY(200);
			for (int i=0; i<3; i++) {

				rob.move(200);
				rob.turn(120);
			}
		}
		public void circle() {
			rob.penDown();
			rob.setSpeed(100);
			rob.setX(200);
			rob.setY(200);
			for (int i=0; i<360; i++) {
				rob.move(1);
				rob.turn(1);
			}
		}
		
}
	

