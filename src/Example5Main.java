import java.util.Scanner;

public class Example5Main {

	public static void main(String[] args) {
		//create a program that ask the user to enter the number of hours worked
		//declare a Scanner Object
		Scanner input = new Scanner(System.in);
		//declare variables
		double hours, wages;
		//ask the user to enter hours they worked
		System.out.println("Please enter the hours worked");
		//read the next double into the variable hours
		hours = input.nextDouble();
		
		//calculate the wages
		if (hours <=40){
			wages = hours * 10.5;
		} else {
			wages = (40 * 10.5) + ((hours-40)* 15.0);
			
		}
//print out the wages
		System.out.println("The wages are: " + wages);
		
	}

}
