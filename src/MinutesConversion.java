/*
 * @author Tracy L Quintos
 * @assignment #2 page 116 #11
 * @date 2/22/17
 *
 */
import java.util.Scanner;

public class MinutesConversion {

private static Scanner inputDevice;

	/*
* Write a program that accepts a number of minutes and converts it both to hours
*and days. For example, 6000 minutes equals 100 hours and equals 4.167 days. Save
*the class as MinutesConversion.java.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minutes, hours; 
		float days; // float for decimal point
		
		inputDevice = new Scanner(System.in);
		System.out.println("Please enter minutes for conversion >> ");		//user is prompted to input
		minutes = inputDevice.nextInt();									//input method
		
		//60 minutes = 1 hour
		// 6000 minutes = 4.167 days
		
	     hours = minutes / 60; //equation to convert minutes by 60 to get hours
	     days = hours / 24.0f;
				
		
		System.out.println("\nYou have entered " + minutes + " minutes." + "\n" + minutes + " minutes is " + hours + " hour(s). \n" + minutes 
				+ " minutes is " + days + " days(s). ");
		
		
	}

}
