package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

import _03_method_writing._1_obedient_robot.Tofu;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int  happinessLevel = 0;
	public static void main(String[] args) {

		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String food =JOptionPane.showInputDialog("what do you want to buy.");
	
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for (int i=0; i<10; i++) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Do you want to cuddle, walk, or clean your pet.", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "walk", "clean" }, null);
			JOptionPane.showInputDialog("Do you want to cuddle, walk, or clean your pet.");
			// 6. Use user input to call the appropriate method created in step 5 below.
			HappyPet r= new HappyPet();
			if (task==0) {
				r.Clean();
			}
			if (task==1) {
				r.Walk();
			}
			if (task==2) {
				r.Cuddle();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel==100) {
				
			}
		}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public void Cuddle() {
		happinessLevel=happinessLevel+30;
		}	
		public void Walk() {
			happinessLevel=happinessLevel+20;
		}
		public void Clean() {
			happinessLevel=happinessLevel+10;
		}
}