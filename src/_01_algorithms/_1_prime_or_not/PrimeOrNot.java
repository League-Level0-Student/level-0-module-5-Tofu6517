package _01_algorithms._1_prime_or_not;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
	String input=JOptionPane.showInputDialog("type a number");
	int prime = Integer.parseInt(input);
Boolean isPrime=true;
	for(int i=2; i<=prime-1;i++) {
		if(prime % i==0) {
			isPrime=false;
		}
	}
		if(isPrime) {
			JOptionPane.showMessageDialog(null, "Its prime.");
	}
		else {
			JOptionPane.showMessageDialog(null, "Its not prime.");
		}
	
}
}