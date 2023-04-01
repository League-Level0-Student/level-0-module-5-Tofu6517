package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class bestchairmychair {
	public class SkillPractice {
		public void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		      
		}

		void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes=	JOptionPane.showInputDialog("how many dimes do you have");
int dimes1=Integer.parseInt(dimes);

dimes1=dimes1*10;
		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null,"you have"+dimes1+"cents.");



		// Ask the user how tall they are (inches)
		String tall=JOptionPane.showInputDialog("how tall are you.");
		int tall1=Integer.parseInt(tall);


		// If they are shorter than 36 inches, tell them to eat their Wheaties
if(tall1<36) {
	JOptionPane.showMessageDialog(null,"eat your wheaties.");
}



		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console
			for(int i=1; i<=30;i+=3) {
				System.out.println(i);
				}


			
		}

		void skill3() { // Get a random number that is less than 20 and print it to the console
			int number = 0;
			int number1= 0;
			Random ran = new Random();
			number=ran.nextInt(20-1+1)+ 1;
			
			System.out.println(number);

		// Get another random number that is less than 10 and print it to the console
number=ran.nextInt(10-1+1)+ 1;
			
			System.out.println(number1);

int number2=number-number1;
		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction

			JOptionPane.showMessageDialog(null,"the differerence is"+number2);

		}

		void skill4() { // In a pop-up, ask the user for the city they live in
			String city=JOptionPane.showInputDialog("what city do you live in.");


		// If they answered "San Diego", tell them they live in America's Finest City
if(city=="San Diego") {
	JOptionPane.showMessageDialog(null,"what city do you live in.");
}


		// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null,"go to San Diego");
}


		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars= 2;


		// If there is 1 car, use a pop-up to display the make/model of the car



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



		}

		void skill5() { // In a pop-up, ask the user for the name of their school
			String school=JOptionPane.showInputDialog("what school do you go to.");


		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
			JOptionPane.showMessageDialog(null,school+"is a great school.");


		}
		}

}
